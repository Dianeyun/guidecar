package com.xzy.entity;

import java.sql.Date;

/**
 * 日志
 * @author J·Y
 *
 */
public class Journal {
	private int id;  //日志id
	private String wbId;  //订单号
	private Date operTime;  //操作时间
	private String operDapt;  //操作部门
	private String operUser;  //操作人
	private String operDesc;  //操作内容
	private String operMenu;  //操作菜单
	public Journal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Journal(int id, String wbId, Date operTime, String operDapt, String operUser, String operDesc,
			String operMenu) {
		super();
		this.id = id;
		this.wbId = wbId;
		this.operTime = operTime;
		this.operDapt = operDapt;
		this.operUser = operUser;
		this.operDesc = operDesc;
		this.operMenu = operMenu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWbId() {
		return wbId;
	}
	public void setWbId(String wbId) {
		this.wbId = wbId;
	}
	public Date getOperTime() {
		return operTime;
	}
	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}
	public String getOperDapt() {
		return operDapt;
	}
	public void setOperDapt(String operDapt) {
		this.operDapt = operDapt;
	}
	public String getOperUser() {
		return operUser;
	}
	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}
	public String getOperDesc() {
		return operDesc;
	}
	public void setOperDesc(String operDesc) {
		this.operDesc = operDesc;
	}
	public String getOperMenu() {
		return operMenu;
	}
	public void setOperMenu(String operMenu) {
		this.operMenu = operMenu;
	}
	@Override
	public String toString() {
		return "Journal [id=" + id + ", wbId=" + wbId + ", operTime=" + operTime + ", operDapt=" + operDapt
				+ ", operUser=" + operUser + ", operDesc=" + operDesc + ", operMenu=" + operMenu + "]";
	}
	
}
