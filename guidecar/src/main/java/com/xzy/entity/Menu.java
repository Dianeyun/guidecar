package com.xzy.entity;
/**
 * 菜单
 * @author J·Y
 *
 */
public class Menu {
	private int id;  //菜单id
	private String name;  //菜单名称
	private String url;  //菜单路径
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(int id, String name, String url) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", url=" + url + "]";
	}
	
}
