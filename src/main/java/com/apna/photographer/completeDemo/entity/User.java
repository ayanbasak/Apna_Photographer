package com.apna.photographer.completeDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

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
	
	@Column(name="budget")
	private String budget;
	
	@Column(name="oc_date")
	private String ocDate;
	
	@Column(name="need")
	private String need;
	
	@Column(name="password")
	private String password;
	
	

	public User() {
		
	}



	public User(String fullName, String email, int phoneNo, String location, String budget, String ocDate, String need,
			String password) {
		
		this.fullName = fullName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.location = location;
		this.budget = budget;
		this.ocDate = ocDate;
		this.need = need;
		this.password = password;
	}


	

	public User(int id, String fullName, String email, int phoneNo, String location, String budget, String ocDate,
			String need, String password) {
		
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.location = location;
		this.budget = budget;
		this.ocDate = ocDate;
		this.need = need;
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



	public String getBudget() {
		return budget;
	}



	public void setBudget(String budget) {
		this.budget = budget;
	}



	public String getOcDate() {
		return ocDate;
	}



	public void setOcDate(String ocDate) {
		this.ocDate = ocDate;
	}



	public String getNeed() {
		return need;
	}



	public void setNeed(String need) {
		this.need = need;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", email=" + email + ", phoneNo=" + phoneNo + ", location="
				+ location + ", budget=" + budget + ", ocDate=" + ocDate + ", need=" + need + ", password=" + password
				+ "]";
	}

	
}
