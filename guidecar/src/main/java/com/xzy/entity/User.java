package com.xzy.entity;

import java.sql.Date;
/**
 * 平台用户
 * @author J·Y
 *
 */
public class User {
	private int id; //用户id
	private String name;  //用户账号
	private String password;  //用户密码
	private String nick_name;  //用户昵称
	private String sex;  //用户性别
	private String phone;  //用户电话
	private String email;  //用户邮箱
	private Date regtime;  //用户注册时间
	private int dept_id;  //用户部门id
	private int type;  //用户类型 '0-平台管理员  1-公司管理员 2-公司用户'
	private String location;  //用户地址
	private int company_id;  //用户公司id
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String password, String nick_name, String sex, String phone, String email,
			Date regtime, int dept_id, int type, String location, int company_id) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.nick_name = nick_name;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
		this.regtime = regtime;
		this.dept_id = dept_id;
		this.type = type;
		this.location = location;
		this.company_id = company_id;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", nick_name=" + nick_name + ", sex="
				+ sex + ", phone=" + phone + ", email=" + email + ", regtime=" + regtime + ", dept_id=" + dept_id
				+ ", type=" + type + ", location=" + location + ", company_id=" + company_id + "]";
	}
	
	
}
