package com.xzy.entity;
/**
 * 角色
 * @author J·Y
 *
 */
public class Role {
	private int id;  //角色id
	private String name;  //角色名字
	private String roledesc;  //角色描述
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int id, String name, String roledesc) {
		super();
		this.id = id;
		this.name = name;
		this.roledesc = roledesc;
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
	public String getRoledesc() {
		return roledesc;
	}
	public void setRoledesc(String roledesc) {
		this.roledesc = roledesc;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", roledesc=" + roledesc + "]";
	}
	
}
