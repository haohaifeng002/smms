package com.gradDesign.smms.service.base;

import com.gradDesign.smms.page.PageRequestBean;
import com.gradDesign.smms.page.PageResponseBean;


/**
 * 分页查询接口
 * @author seawind
 *
 */
public interface PageQuery {
	/**
	 * 分页查询
	 * @param pageRequestBean
	 * @return
	 */
	public PageResponseBean pageQuery(PageRequestBean pageRequestBean);
}
