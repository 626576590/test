package com.cecsm.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述:
 * 
 * @author zxt
 */

public class Base implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date create_time;

	private Date update_time;

	private Integer status;

	private int currentPage;
	
	private int recordCount;

	private int pageSize;

	private int fromIndex;

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	// 总页数
	public int getPageCount() {
		if (pageSize == 0 || recordCount == 0)
			return 0;
		int size = recordCount / pageSize;// 总条数/每页显示的条数=总页数
		int mod = recordCount % pageSize;// 最后一页的条数
		if (mod != 0)
			size++;
		return recordCount == 0 ? 1 : size;
	}

	public void setFromIndex(int fromIndex) {
		this.fromIndex = (currentPage - 1) * pageSize;
	}
	
	// 包含，起始索引为0
	public int getFromIndex() {
        if (this.fromIndex != 0) {
        	return this.fromIndex;
        }
		return currentPage - 1 >= 0?(currentPage - 1) * pageSize : 0;
	}
	
	// 得到当前页
	public int getCurrentPage() {
		return currentPage - 1 >= 0?currentPage:1;
	}// 设置当前页

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}// 得到每页显示的条数

	public int getPageSize() {
		return pageSize == 0?Integer.MAX_VALUE:pageSize;
	}// 设置每页显示的条数

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}// 得到总共的条数

}
