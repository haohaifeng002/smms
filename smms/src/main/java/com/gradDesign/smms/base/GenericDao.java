package com.gradDesign.smms.base;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface GenericDao<T> {
	
     public void persist(T entity);
      
     public Serializable save(T entity);
      
     public void saveOrUpdate(T entity);
     
     public void update (T entity);
     
     public void merge (T entity);
     
     public void delete(T entity);
     
     public void deleteAll(Collection<T> entities);
      
     public void flush();
     
     public T load(Serializable id) throws Exception;
     
     public T get(Serializable id);
     
     public List<T> getByIds(Long[] ids);
      
     public List<T> findAll(); 
     
     public List<T> pageQuery(DetachedCriteria criteria, int firstResult,
 			int maxResults);
     
     public long findTotalCount(DetachedCriteria criteria);
     
     public List<T> findByCriteria(DetachedCriteria criteria);
     
     public List<T> findByNamedQuery(String queryName, Object... values);

}
