package com.xzy.entity;
/**
 * ��ɫ
 * @author J��Y
 *
 */
public class Role {
	private int id;  //��ɫid
	private String name;  //��ɫ����
	private String roledesc;  //��ɫ����
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
