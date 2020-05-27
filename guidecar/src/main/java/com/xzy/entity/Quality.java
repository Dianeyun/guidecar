package com.xzy.entity;
/**
 * 质量
 * @author J·Y
 *
 */
public class Quality {
	private int id;  //质量id
	private String status;  //质量考核状态
	private int complaintId;  //投诉类型
	private String qualitydesc;  //质量描述
	private String theme;  //主题
	private String opinion;   //处理意见
	private int damages;  //赔偿金额
	public Quality() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Quality(int id, String status, int complaintId, String qualitydesc, String theme, String opinion,
			int damages) {
		super();
		this.id = id;
		this.status = status;
		this.complaintId = complaintId;
		this.qualitydesc = qualitydesc;
		this.theme = theme;
		this.opinion = opinion;
		this.damages = damages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}
	public String getQualitydesc() {
		return qualitydesc;
	}
	public void setQualitydesc(String qualitydesc) {
		this.qualitydesc = qualitydesc;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	public int getDamages() {
		return damages;
	}
	public void setDamages(int damages) {
		this.damages = damages;
	}
	@Override
	public String toString() {
		return "Quality [id=" + id + ", status=" + status + ", complaintId=" + complaintId + ", qualitydesc="
				+ qualitydesc + ", theme=" + theme + ", opinion=" + opinion + ", damages=" + damages + "]";
	}
	
}
