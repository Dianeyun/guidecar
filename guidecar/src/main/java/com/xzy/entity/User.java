package com.xzy.entity;

import java.sql.Date;
/**
 * ƽ̨�û�
 * @author J��Y
 *
 */
public class User {
	private int id; //�û�id
	private String name;  //�û��˺�
	private String password;  //�û�����
	private String nick_name;  //�û��ǳ�
	private String sex;  //�û��Ա�
	private String phone;  //�û��绰
	private String email;  //�û�����
	private Date regtime;  //�û�ע��ʱ��
	private int dept_id;  //�û�����id
	private int type;  //�û����� '0-ƽ̨����Ա  1-��˾����Ա 2-��˾�û�'
	private String location;  //�û���ַ
	private int company_id;  //�û���˾id
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
