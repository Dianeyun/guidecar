package com.xzy.entity;

import java.sql.Date;
/**
 * 公司
 * @author J·Y
 *
 */
public class Company {
	private int id;  //公司id
	private String name;  //公司名字
	private Date regtime;  //公司注册时间
	private String fshort;  //公司简称
	private int bulino;  //公司营业证号
	private String corname;  //公司法人名称
	private String phone;  //公司电话
	private String detaress;  //公司详细地址
	private int comnumber;  //公司编号
	private String comadmin;  //公司管理员账号
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int id, String name, Date regtime, String fshort, int bulino, String corname, String phone,
			String detaress, int comnumber, String comadmin) {
		super();
		this.id = id;
		this.name = name;
		this.regtime = regtime;
		this.fshort = fshort;
		this.bulino = bulino;
		this.corname = corname;
		this.phone = phone;
		this.detaress = detaress;
		this.comnumber = comnumber;
		this.comadmin = comadmin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	public String getFshort() {
		return fshort;
	}
	public void setFshort(String fshort) {
		this.fshort = fshort;
	}
	public int getBulino() {
		return bulino;
	}
	public void setBulino(int bulino) {
		this.bulino = bulino;
	}
	public String getCorname() {
		return corname;
	}
	public void setCorname(String corname) {
		this.corname = corname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDetaress() {
		return detaress;
	}
	public void setDetaress(String detaress) {
		this.detaress = detaress;
	}
	public int getComnumber() {
		return comnumber;
	}
	public void setComnumber(int comnumber) {
		this.comnumber = comnumber;
	}
	public String getComadmin() {
		return comadmin;
	}
	public void setComadmin(String comadmin) {
		this.comadmin = comadmin;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", regtime=" + regtime + ", fshort=" + fshort + ", bulino="
				+ bulino + ", corname=" + corname + ", phone=" + phone + ", detaress=" + detaress + ", comnumber="
				+ comnumber + ", comadmin=" + comadmin + "]";
	}
	
}
