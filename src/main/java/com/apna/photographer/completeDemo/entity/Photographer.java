package com.apna.photographer.completeDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="photographer")
public class Photographer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone_no")
	private int phoneNo;
	
	@Column(name="location")
	private String location;
	
	@Column(name="Expectation_fees")
	private String exFees;
	
	@Column(name="Experience")
	private String experience;
	
	@Column(name="job_type")
	private String jobType;
	
	@Column(name="password")
	private String password;
	
	

	public Photographer() {
		
	}

	
	public Photographer(int id, String fullName, String email, int phoneNo, String location, String exFees,
			String experience, String jobType, String password) {
	
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.location = location;
		this.exFees = exFees;
		this.experience = experience;
		this.jobType = jobType;
		this.password = password;
	}


	
	public Photographer(String fullName, String email, int phoneNo, String location, String exFees, String experience,
			String jobType, String password) {

		this.fullName = fullName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.location = location;
		this.exFees = exFees;
		this.experience = experience;
		this.jobType = jobType;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getExFees() {
		return exFees;
	}

	public void setExFees(String exFees) {
		this.exFees = exFees;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Photographer [id=" + id + ", fullName=" + fullName + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", location=" + location + ", exFees=" + exFees + ", experience=" + experience + ", jobType="
				+ jobType + ", password=" + password + "]";
	}
	
	
}
