package com.gradDesign.smms.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

//@Transactional 注解可以被继承
//@Transactional 注解对父类中声明的方法无效
@Transactional
public class GenericDaoImpl<T> extends HibernateDaoSupport implements GenericDao<T> {

	@Autowired
	private SessionFactory sessionFactory;
	private Class<T> entityClass;

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * 构造方法，通过反射泛型获取类对象
	 */
	@SuppressWarnings("unchecked")
	public GenericDaoImpl() {
		ParameterizedType pt = (ParameterizedType) getClass()
				.getGenericSuperclass();
		entityClass = (Class<T>) pt.getActualTypeArguments()[0];
		System.out.println("---------------"+entityClass+"-------------");
	}

	/**
	 * load支持延迟加载(lazy),如果数据库中不在数据load会抛出异常(org.hibernate.ObjectNotFoundException)。
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T load(Serializable id) throws Exception {
		return (T) getCurrentSession().load(entityClass, id);
	}

	/**
	 * get()方法默认不支持lazy(延迟加载)功能,在查询不到数据时，返回null
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T get(Serializable id) {
		return (T) getCurrentSession().get(entityClass, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getByIds(Long[] ids) {
		if (ids == null || ids.length == 0) {
			return Collections.EMPTY_LIST;
		} else {
			return getCurrentSession().createQuery(
					"FROM " + entityClass.getSimpleName() + " WHERE id IN (:ids)")
					.setParameterList("ids", ids)
					.list();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return getCurrentSession()
				.createQuery("from " + entityClass.getSimpleName())
				.setCacheable(true).list();
	}

	/**
	 * 对于长事务的处理,应该使用persist代替save,减少数据库交互
	 */
	public void persist (T entity) {
		getCurrentSession().persist(entity);
	}

	public Serializable save (T entity) {
		Serializable se = null;
		try {
			se = getCurrentSession().save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return se;
	}

	public void saveOrUpdate (T entity) {
		getCurrentSession().save(entity);
	}
	
	public void update (T entity) {
		getCurrentSession().update(entity);
	}
	
	/**
	 * 更新，对于长事务的处理,应该使用persist代替update,减少数据库交互
	 * @param entity
	 */
	public void merge (T entity) {
		getCurrentSession().merge(entity);
	}
	
	public void delete(T entity) {
		getCurrentSession().delete(entity);
	}

	public void deleteAll(Collection<T> entities) {
		this.getHibernateTemplate().deleteAll(entities);
	}
	
	@Override
	public void flush () {
		getCurrentSession().flush();
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> pageQuery(DetachedCriteria criteria, int firstResult,
			int maxResults) {
		return (List<T>) getHibernateTemplate().findByCriteria(criteria, firstResult, maxResults);
	}

	public long findTotalCount(DetachedCriteria criteria) {
		// 使用QBC的投影查询
		// 添加投影 ，不加投影 select * ，添加投影 Projections.rowCount() ---- select count(*)
		criteria.setProjection(Projections.rowCount());
		// 之前查询结果记录 firstResult和maxResults 会保存Criteria 
		List<?> list = this.getHibernateTemplate().findByCriteria(criteria,0,1);// 只要结果第一条数据 
		return (Long) list.get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByCriteria(DetachedCriteria criteria) {
		return (List<T>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findByNamedQuery(String queryName, Object... values) {
		return (List<T>) this.getHibernateTemplate().findByNamedQuery(queryName,values);
	}

	
/*
	@Override
	public PageResponseBean queryByLucene(int page, int rows,
			String conditionName, String conditionValue) {
		// 性能监控对象
		Statistics statistics = this.getSessionFactory().getStatistics();
		
		// hibernate search 查询
		// 1、 获得HibernateSession 
		Session session = this.getCurrentSession();
		// 2、通过hibernate session 获得全文检索Session
		FullTextSession fullTextSession = new FullTextSessionImpl(session);
		
		// 3、获得 lucene的Query
		WildcardQuery query = new WildcardQuery(new Term(conditionName,"*"+conditionValue+"*"));
		
		// 4、获得全文检索 Query
		FullTextQuery fullTextQuery = fullTextSession.createFullTextQuery(query);
		// 使用二级缓存 
		fullTextQuery.initializeObjectsWith(ObjectLookupMethod.SECOND_LEVEL_CACHE, DatabaseRetrievalMethod.FIND_BY_ID);
		
		PageResponseBean pageResponseBean = new PageResponseBean();
		// 总数
		int total = fullTextQuery.getResultSize();
		pageResponseBean.setTotal(total);
		
		// 记录数据 （分页）
		int firstResult = (page-1)* rows;
		int maxResults = rows;
		fullTextQuery.setFirstResult(firstResult);
		fullTextQuery.setMaxResults(maxResults);
		
		List list = fullTextQuery.list();
		pageResponseBean.setRows(list);
		
		// 记录命中次数 和 丢失次数 
		LOGGER.info("命中次数：" + statistics.getSecondLevelCacheHitCount());
		LOGGER.info("丢失次数：" + statistics.getSecondLevelCacheMissCount());
		
		return pageResponseBean;
	}
*/
}
