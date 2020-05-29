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
<<<<<<< HEAD
<<<<<<< HEAD
	private String nickName;  //用户昵称
=======
	private String nickName;  //用户昵称nickName
>>>>>>> yq
=======
	private String nickName;  //用户昵称
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	private String sex;  //用户性别
	private String phone;  //用户电话
	private String email;  //用户邮箱
	private Date regtime;  //用户注册时间
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	private int daptId;  //用户部门id
	private int type;  //用户类型 '0-平台管理员  1-公司管理员 2-公司用户'
	private String location;  //用户地址
	private int companyId;  //用户公司id
<<<<<<< HEAD
=======
	private int deptId;  //用户部门id
	private int type;  //用户类型 '0-平台管理员  1-公司管理员 2-公司用户'
	private String location;  //用户地址
	private int companyId;  //用户公司id companyId
>>>>>>> yq
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String password, String nickName, String sex, String phone, String email,
<<<<<<< HEAD
<<<<<<< HEAD
			Date regtime, int daptId, int type, String location, int companyId) {
=======
			Date regtime, int deptId, int type, String location, int companyId) {
>>>>>>> yq
=======
			Date regtime, int daptId, int type, String location, int companyId) {
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.nickName = nickName;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
		this.regtime = regtime;
<<<<<<< HEAD
<<<<<<< HEAD
		this.daptId = daptId;
=======
		this.deptId = deptId;
>>>>>>> yq
=======
		this.daptId = daptId;
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
		this.type = type;
		this.location = location;
		this.companyId = companyId;
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
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
	public int getDaptId() {
		return daptId;
	}
	public void setDaptId(int daptId) {
		this.daptId = daptId;
<<<<<<< HEAD
=======
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
>>>>>>> yq
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
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
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", nickName=" + nickName + ", sex="
<<<<<<< HEAD
<<<<<<< HEAD
				+ sex + ", phone=" + phone + ", email=" + email + ", regtime=" + regtime + ", daptId=" + daptId
=======
				+ sex + ", phone=" + phone + ", email=" + email + ", regtime=" + regtime + ", deptId=" + deptId
>>>>>>> yq
=======
				+ sex + ", phone=" + phone + ", email=" + email + ", regtime=" + regtime + ", daptId=" + daptId
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
				+ ", type=" + type + ", location=" + location + ", companyId=" + companyId + "]";
	}
	
}
