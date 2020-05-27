package com.xzy.entity;
/**
 * 货物
 * @author J·Y
 *
 */
public class Goods {
	private int id;  //货物id
	private String name;  //货物名称
	private int companyId;  //公司id
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(int id, String name, int companyId) {
		super();
		this.id = id;
		this.name = name;
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
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", companyId=" + companyId + "]";
	}
	
}
