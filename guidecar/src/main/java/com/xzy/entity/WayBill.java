package com.xzy.entity;

import java.sql.Date;
/**
 * 订单
 * @author J·Y
 *
 */
public class WayBill {
	private int id;  //订单id
	private String wb_id;  //订单号
	private String name;  //货物名称
	private String consignee_name;  //收货人姓名
	private String consignee_phone;  //收货人电话
	private String consignor_name;  //发货人姓名
	private String consignor_phone;  //发货人电话
	private String packing;  //包装描述
	private int number;  //件数
	private int weight;  //重量
	private int freight;  //运费
	private int deliveryfee;  //送货费
	private int pickupfee;  //提货费
	private int damages;  //赔偿费
	private String dept;  //目的部门
	private String wb_status;  //订单状态
	private Date recordingtime;  //录单时间
	private String remarks;  //订单备注
	private int company_id;  //公司id
	public WayBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WayBill(int id, String wb_id, String name, String consignee_name, String consignee_phone,
			String consignor_name, String consignor_phone, String packing, int number, int weight, int freight,
			int deliveryfee, int pickupfee, int damages, String dept, String wb_status, Date recordingtime,
			String remarks, int company_id) {
		super();
		this.id = id;
		this.wb_id = wb_id;
		this.name = name;
		this.consignee_name = consignee_name;
		this.consignee_phone = consignee_phone;
		this.consignor_name = consignor_name;
		this.consignor_phone = consignor_phone;
		this.packing = packing;
		this.number = number;
		this.weight = weight;
		this.freight = freight;
		this.deliveryfee = deliveryfee;
		this.pickupfee = pickupfee;
		this.damages = damages;
		this.dept = dept;
		this.wb_status = wb_status;
		this.recordingtime = recordingtime;
		this.remarks = remarks;
		this.company_id = company_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWb_id() {
		return wb_id;
	}
	public void setWb_id(String wb_id) {
		this.wb_id = wb_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getConsignee_name() {
		return consignee_name;
	}
	public void setConsignee_name(String consignee_name) {
		this.consignee_name = consignee_name;
	}
	public String getConsignee_phone() {
		return consignee_phone;
	}
	public void setConsignee_phone(String consignee_phone) {
		this.consignee_phone = consignee_phone;
	}
	public String getConsignor_name() {
		return consignor_name;
	}
	public void setConsignor_name(String consignor_name) {
		this.consignor_name = consignor_name;
	}
	public String getConsignor_phone() {
		return consignor_phone;
	}
	public void setConsignor_phone(String consignor_phone) {
		this.consignor_phone = consignor_phone;
	}
	public String getPacking() {
		return packing;
	}
	public void setPacking(String packing) {
		this.packing = packing;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getFreight() {
		return freight;
	}
	public void setFreight(int freight) {
		this.freight = freight;
	}
	public int getDeliveryfee() {
		return deliveryfee;
	}
	public void setDeliveryfee(int deliveryfee) {
		this.deliveryfee = deliveryfee;
	}
	public int getPickupfee() {
		return pickupfee;
	}
	public void setPickupfee(int pickupfee) {
		this.pickupfee = pickupfee;
	}
	public int getDamages() {
		return damages;
	}
	public void setDamages(int damages) {
		this.damages = damages;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getWb_status() {
		return wb_status;
	}
	public void setWb_status(String wb_status) {
		this.wb_status = wb_status;
	}
	public Date getRecordingtime() {
		return recordingtime;
	}
	public void setRecordingtime(Date recordingtime) {
		this.recordingtime = recordingtime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	@Override
	public String toString() {
		return "WayBill [id=" + id + ", wb_id=" + wb_id + ", name=" + name + ", consignee_name=" + consignee_name
				+ ", consignee_phone=" + consignee_phone + ", consignor_name=" + consignor_name + ", consignor_phone="
				+ consignor_phone + ", packing=" + packing + ", number=" + number + ", weight=" + weight + ", freight="
				+ freight + ", deliveryfee=" + deliveryfee + ", pickupfee=" + pickupfee + ", damages=" + damages
				+ ", dept=" + dept + ", wb_status=" + wb_status + ", recordingtime=" + recordingtime + ", remarks="
				+ remarks + ", company_id=" + company_id + "]";
	}
	
	
}
