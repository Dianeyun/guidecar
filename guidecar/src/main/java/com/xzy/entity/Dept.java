package com.xzy.entity;
/**
 * ����
 * @author J��Y
 *
 */
public class Dept {
	private int id;  //����id
	private String name;  //��������
	private String deptdesc;  //��������
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int id, String name, String deptdesc) {
		super();
		this.id = id;
		this.name = name;
		this.deptdesc = deptdesc;
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
	public String getDeptdesc() {
		return deptdesc;
	}
	public void setDeptdesc(String deptdesc) {
		this.deptdesc = deptdesc;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", deptdesc=" + deptdesc + "]";
	}
	
}
