package com.gradDesign.smms.page;

import org.hibernate.criterion.DetachedCriteria;

/**
 * 保存 分页查询 请求数据 
 * @author seawind
 *
 */
public class PageRequestBean {
	// 页码
	private int page ;
	// 每页多少条
	private int rows ;
	// 查询条件 
	private DetachedCriteria detachedCriteria; // hibernate提供条件查询对象
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public DetachedCriteria getDetachedCriteria() {
		return detachedCriteria;
	}
	public void setDetachedCriteria(DetachedCriteria detachedCriteria) {
		this.detachedCriteria = detachedCriteria;
	}
	
	
	
}
