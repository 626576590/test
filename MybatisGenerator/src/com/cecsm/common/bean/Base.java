package com.cecsm.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * ����:
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

	// ��ҳ��
	public int getPageCount() {
		if (pageSize == 0 || recordCount == 0)
			return 0;
		int size = recordCount / pageSize;// ������/ÿҳ��ʾ������=��ҳ��
		int mod = recordCount % pageSize;// ���һҳ������
		if (mod != 0)
			size++;
		return recordCount == 0 ? 1 : size;
	}

	public void setFromIndex(int fromIndex) {
		this.fromIndex = (currentPage - 1) * pageSize;
	}
	
	// ��������ʼ����Ϊ0
	public int getFromIndex() {
        if (this.fromIndex != 0) {
        	return this.fromIndex;
        }
		return currentPage - 1 >= 0?(currentPage - 1) * pageSize : 0;
	}
	
	// �õ���ǰҳ
	public int getCurrentPage() {
		return currentPage - 1 >= 0?currentPage:1;
	}// ���õ�ǰҳ

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}// �õ�ÿҳ��ʾ������

	public int getPageSize() {
		return pageSize == 0?Integer.MAX_VALUE:pageSize;
	}// ����ÿҳ��ʾ������

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}// �õ��ܹ�������

}
