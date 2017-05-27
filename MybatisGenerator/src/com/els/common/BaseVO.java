
package com.els.common;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author 曾祥平
 * 
 *         VO 值对象 都要继承该类
 *
 */
public class BaseVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String statusCode;

	private String message;

	private String language;

	/**
	 * 用于分表时，传入表名
	 */
	private String tablename;

	private int pageSize;// 每页显示的条数

	private int recordCount;// 总共的条数

	private int currentPage;// 当前页面

	private int fromIndex;

	private Date createDate;

	private String createUser;

	private Date lastUpdateDate;

	private String lastUpdateUser;

	/** 数据权限对象 */
	private String permissionObject;

	/** 数据权限对象别名 */
	private String permissionObjectAlia;

	private String elsAccount;

	private String elsSubAccount;

	public BaseVO() {

	}

	public String getElsAccount() {
		return elsAccount;
	}

	public void setElsAccount(String elsAccount) {
		this.elsAccount = elsAccount;
	}

	public String getElsSubAccount() {
		return elsSubAccount;
	}

	public void setElsSubAccount(String elsSubAccount) {
		this.elsSubAccount = elsSubAccount;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public BaseVO(String statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getLastUpdateUser() {
		return lastUpdateUser;
	}

	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public String toJson() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String objectJson = mapper.writeValueAsString(this);
			return objectJson;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

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

	// 包含，起始索引为0
	public int getFromIndex() {

		return (currentPage - 1) * pageSize;
	}

	// 不包含
	public int getToIndex() {

		return Math.min(recordCount, currentPage * pageSize);
	}

	public void setFromIndex(int fromIndex) {
		this.fromIndex = (currentPage - 1) * pageSize;
		;
	}

	// 得到当前页
	public int getCurrentPage() {
		return currentPage;
	}// 设置当前页

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}// 得到每页显示的条数

	public int getPageSize() {
		return pageSize;
	}// 设置每页显示的条数

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}// 得到总共的条数

	public int getRecordCount() {
		return recordCount;
	}// 设置总共的条数

	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public String getPermissionObject() {
		return permissionObject;
	}

	public void setPermissionObject(String permissionObject) {
		this.permissionObject = permissionObject;
	}

	public String getPermissionObjectAlia() {
		return permissionObjectAlia;
	}

	public void setPermissionObjectAlia(String permissionObjectAlia) {
		this.permissionObjectAlia = permissionObjectAlia;
	}
}
