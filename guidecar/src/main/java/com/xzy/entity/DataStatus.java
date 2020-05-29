package com.xzy.entity;

import com.google.gson.Gson;

public class DataStatus {
	private String status;  //״̬�룺1 ��ȷ  0 ����
	private String msg;  //������Ϣ
	private Object data;  //��������
	public DataStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataStatus(String status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "DataStatus [status=" + status + ", msg=" + msg + ", data=" + data + "]";
	}
	public String toGson(Object o) {
		
			return new Gson().toJson(o);
		
	}
	
}
