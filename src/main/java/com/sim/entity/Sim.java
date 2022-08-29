package com.sim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "simtable")
public class Sim {
	
	public Sim(long simCardNo, long mobileNo, String status, String date, String state, boolean kyc,
			String telecomProvider, String fullName) {
		super();
		this.simCardNo = simCardNo;
		this.mobileNo = mobileNo;
		this.status = status;
		this.date = date;
		this.state = state;
		this.kyc = kyc;
		this.telecomProvider = telecomProvider;
		this.fullName = fullName;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long simCardNo;
	
	@Column(name = "mobileno", nullable = false)
	private long mobileNo;
	
	@Column(name = "status", nullable = false)
	private String status ;
	
	@Column(name = "date", nullable = false)
	private String date;
	
	@Column(name = "state", nullable = false)
	private String state;
	
	@Column(name = "kyc", nullable = false)
	private boolean kyc;
	
	@Column(name = "provider", nullable = false)
	private String telecomProvider;
	
	@Column(name = "fullname", nullable = false)
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
