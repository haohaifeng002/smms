package com.gradDesign.smms.page;

import java.util.List;

/**
 * 保存 分页查询 响应数据 
 * @author seawind
 *
 */
@SuppressWarnings("rawtypes")
public class PageResponseBean {
	// 结果数据
	private List rows; // 任何类型结果数据
	// 总记录数 
	private long total; // 总记录数 
	
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
}
