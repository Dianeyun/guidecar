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
<<<<<<< HEAD
	private String nickName;  //�û��ǳ�  
=======
<<<<<<< HEAD
	private String nickName;  //�û��ǳ�
=======
<<<<<<< HEAD
<<<<<<< HEAD
	private String nickName;  //�û��ǳ�
=======
	private String nickName;  //�û��ǳ�nickName
>>>>>>> yq
=======
	private String nickName;  //�û��ǳ�
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
	private String sex;  //�û��Ա�
	private String phone;  //�û��绰
	private String email;  //�û�����
	private Date regtime;  //�û�ע��ʱ��
<<<<<<< HEAD
	private int deptId;  //�û�����id
	private int type;  //�û����� '0-ƽ̨����Ա  1-��˾����Ա 2-��˾�û�'
	private String location;  //�û���ַ
	private int companyId;  //�û���˾id

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
	private int daptId;  //�û�����id
	private int type;  //�û����� '0-ƽ̨����Ա  1-��˾����Ա 2-��˾�û�'
	private String location;  //�û���ַ
	private int companyId;  //�û���˾id
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
	private int deptId;  //�û�����id
	private int type;  //�û����� '0-ƽ̨����Ա  1-��˾����Ա 2-��˾�û�'
	private String location;  //�û���ַ
	private int companyId;  //�û���˾id companyId
>>>>>>> yq
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, String password, String nickName, String sex, String phone, String email,
<<<<<<< HEAD

			Date regtime, int deptId, int type, String location, int companyId) {

=======
<<<<<<< HEAD
			Date regtime, int daptId, int type, String location, int companyId) {
=======
<<<<<<< HEAD
<<<<<<< HEAD
			Date regtime, int daptId, int type, String location, int companyId) {
=======
			Date regtime, int deptId, int type, String location, int companyId) {
>>>>>>> yq
=======
			Date regtime, int daptId, int type, String location, int companyId) {
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
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
		this.deptId = deptId;
=======
<<<<<<< HEAD
		this.daptId = daptId;
=======
<<<<<<< HEAD
<<<<<<< HEAD
		this.daptId = daptId;
=======
		this.deptId = deptId;
>>>>>>> yq
=======
		this.daptId = daptId;
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
		this.type = type;
		this.location = location;
		this.companyId = companyId;
	}
<<<<<<< HEAD
			
	
	
=======
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
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

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
	public int getDaptId() {
		return daptId;
	}
	public void setDaptId(int daptId) {
		this.daptId = daptId;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
<<<<<<< HEAD
	}
	
=======
>>>>>>> yq
=======
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
	}
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
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

				+ sex + ", phone=" + phone + ", email=" + email + ", regtime=" + regtime + ", deptId=" + deptId

=======
<<<<<<< HEAD
				+ sex + ", phone=" + phone + ", email=" + email + ", regtime=" + regtime + ", daptId=" + daptId
=======
<<<<<<< HEAD
<<<<<<< HEAD
				+ sex + ", phone=" + phone + ", email=" + email + ", regtime=" + regtime + ", daptId=" + daptId
=======
				+ sex + ", phone=" + phone + ", email=" + email + ", regtime=" + regtime + ", deptId=" + deptId
>>>>>>> yq
=======
				+ sex + ", phone=" + phone + ", email=" + email + ", regtime=" + regtime + ", daptId=" + daptId
>>>>>>> b6ec5007b0f82461b25e9dc45395442b9bc5fb93
>>>>>>> d75f37ac26b1671ae3b85d3716fd4ea6959e117a
>>>>>>> d47052da0dd85e409feae8f7ffd0417c82ba2fe8
				+ ", type=" + type + ", location=" + location + ", companyId=" + companyId + "]";
	}
	
}
