package com.xzy.entity;

import java.sql.Date;
/**
 * ����
 * @author J��Y
 *
 */
public class WayBill {
	private int id;  //����id
	private String wbId;  //������
	private String name;  //��������
	private String consigneeName;  //�ջ�������
	private String consigneePhone;  //�ջ��˵绰
	private String consignorName;  //����������
	private String consignorPhone;  //�����˵绰
	private String packing;  //��װ����
	private int number;  //����
	private int weight;  //����
	private int freight;  //�˷�
	private int deliveryfee;  //�ͻ���
	private int pickupfee;  //�����
	private int damages;  //�⳥��
	private String dept;  //Ŀ�Ĳ���
	private String wbStatus;  //����״̬
	private Date recordingtime;  //¼��ʱ��
	private String remarks;  //������ע
	public WayBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WayBill(int id, String wbId, String name, String consigneeName, String consigneePhone, String consignorName,
			String consignorPhone, String packing, int number, int weight, int freight, int deliveryfee, int pickupfee,
			int damages, String dept, String wbStatus, Date recordingtime, String remarks) {
		super();
		this.id = id;
		this.wbId = wbId;
		this.name = name;
		this.consigneeName = consigneeName;
		this.consigneePhone = consigneePhone;
		this.consignorName = consignorName;
		this.consignorPhone = consignorPhone;
		this.packing = packing;
		this.number = number;
		this.weight = weight;
		this.freight = freight;
		this.deliveryfee = deliveryfee;
		this.pickupfee = pickupfee;
		this.damages = damages;
		this.dept = dept;
		this.wbStatus = wbStatus;
		this.recordingtime = recordingtime;
		this.remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWbId() {
		return wbId;
	}
	public void setWbId(String wbId) {
		this.wbId = wbId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getConsigneeName() {
		return consigneeName;
	}
	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}
	public String getConsigneePhone() {
		return consigneePhone;
	}
	public void setConsigneePhone(String consigneePhone) {
		this.consigneePhone = consigneePhone;
	}
	public String getConsignorName() {
		return consignorName;
	}
	public void setConsignorName(String consignorName) {
		this.consignorName = consignorName;
	}
	public String getConsignorPhone() {
		return consignorPhone;
	}
	public void setConsignorPhone(String consignorPhone) {
		this.consignorPhone = consignorPhone;
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
	public String getWbStatus() {
		return wbStatus;
	}
	public void setWbStatus(String wbStatus) {
		this.wbStatus = wbStatus;
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
	@Override
	public String toString() {
		return "WayBill [id=" + id + ", wbId=" + wbId + ", name=" + name + ", consigneeName=" + consigneeName
				+ ", consigneePhone=" + consigneePhone + ", consignorName=" + consignorName + ", consignorPhone="
				+ consignorPhone + ", packing=" + packing + ", number=" + number + ", weight=" + weight + ", freight="
				+ freight + ", deliveryfee=" + deliveryfee + ", pickupfee=" + pickupfee + ", damages=" + damages
				+ ", dept=" + dept + ", wbStatus=" + wbStatus + ", recordingtime=" + recordingtime + ", remarks="
				+ remarks + "]";
	}
	
}
