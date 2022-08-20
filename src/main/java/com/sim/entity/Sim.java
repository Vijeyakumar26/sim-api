package com.sim.entity;

public class Sim {
	private long simCardNo;
	private long mobileNo;
	private String status ;
	private String date;
	private String state;
	private boolean kyc;
	private String telecomProvider;
	private String fullName;
	
	public long getSimCardNo() {
		return simCardNo;
	}
	public void setSimCardNo(long simCardNo) {
		this.simCardNo = simCardNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public boolean isKyc() {
		return kyc;
	}
	public void setKyc(boolean kyc) {
		this.kyc = kyc;
	}
	public String getTelecomProvider() {
		return telecomProvider;
	}
	public void setTelecomProvider(String telecomProvider) {
		this.telecomProvider = telecomProvider;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Sim [simCardNo=" + simCardNo + ", mobileNo=" + mobileNo + ", status=" + status + ", date=" + date
				+ ", state=" + state + ", kyc=" + kyc + ", telecomProvider=" + telecomProvider + ", fullName="
				+ fullName + "]";
	}
	
	
}
