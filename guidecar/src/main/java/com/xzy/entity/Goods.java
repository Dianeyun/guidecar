package com.xzy.entity;
/**
 * ����
 * @author J��Y
 *
 */
public class Goods {
	private int id;  //����id
	private String name;  //��������
	private int companyId;  //��˾id
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
