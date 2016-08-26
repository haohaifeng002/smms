package com.gradDesign.smms.service.base;

import java.util.List;

import com.gradDesign.smms.base.GenericDao;
import com.gradDesign.smms.base.GenericDaoImpl;
import com.gradDesign.smms.page.PageRequestBean;
import com.gradDesign.smms.page.PageResponseBean;


public abstract class BaseService<T> extends GenericDaoImpl<T>{
	// 公共分页查询方法
		public <T> PageResponseBean pageQuery(PageRequestBean pageRequestBean,
				GenericDao<T> dao) {
			// 结果数据
			PageResponseBean pageResponseBean = new PageResponseBean();

			// 先查询结果数据
			int firstResult = (pageRequestBean.getPage() - 1)
					* pageRequestBean.getRows();
			int maxResults = pageRequestBean.getRows();
			List<T> list = dao.pageQuery(
					pageRequestBean.getDetachedCriteria(), firstResult, maxResults);
			pageResponseBean.setRows(list);

			// 再查询满足条件记录总数
			long total = dao.findTotalCount(pageRequestBean
					.getDetachedCriteria());
			pageResponseBean.setTotal(total);

			return pageResponseBean;
		}
}
