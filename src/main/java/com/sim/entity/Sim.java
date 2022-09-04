package com.sim.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "simtable")
public class Sim {
	
	public Sim() {}
	
	public Sim(Long mobileNo, String status, LocalDate expiryDate, String state, boolean kyc,
			String telecomProvider, String fullName) {
		super();
		this.mobileNo = mobileNo;
		this.status = status;
		this.expiryDate = expiryDate;
		this.state = state;
		this.kyc = kyc;
		this.telecomProvider = telecomProvider;
		this.fullName = fullName;
	}
	
	@Id
	@SequenceGenerator(name = "sim_sequence", sequenceName = "sim_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long simCardNo;
	
	@Column(name = "mobileno", nullable = false)
	private Long mobileNo;
	
	@Column(name = "status")
	private String status ;
	
	@Column(name = "expiry_date")
	private LocalDate expiryDate;
	
	@Column(name = "state", nullable = false)
	private String state;
	
	@Column(name = "kyc")
	private boolean kyc;
	
	@Column(name = "provider", nullable = false)
	private String telecomProvider;
	
	@Column(name = "fullname", nullable = false)
	private String fullName;
	
	public Long getSimCardNo() {
		return simCardNo;
	}
	public void setSimCardNo(Long simCardNo) {
		this.simCardNo = simCardNo;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDate() {
		return expiryDate;
	}
	public void setDate(LocalDate date) {
		this.expiryDate = date;
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
		return "Sim [simCardNo=" + simCardNo + ", mobileNo=" + mobileNo + ", status=" + status + ", expiryDate=" + expiryDate
				+ ", state=" + state + ", kyc=" + kyc + ", telecomProvider=" + telecomProvider + ", fullName="
				+ fullName + "]";
	}
}
