package com.xzy.entity;
/**
 * Ͷ��
 * @author J��Y
 *
 */
public class Complaint {
	private int id;  //Ͷ��id
	private String complaintType;  //Ͷ������
	private int companyId;  //��˾id
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaint(int id, String complaintType, int companyId) {
		super();
		this.id = id;
		this.complaintType = complaintType;
		this.companyId = companyId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComplaintType() {
		return complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	@Override
	public String toString() {
		return "Complaint [id=" + id + ", complaintType=" + complaintType + ", companyId=" + companyId + "]";
	}
	
}
