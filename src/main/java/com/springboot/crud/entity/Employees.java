package com.springboot.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "number")
	private long phoneNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "primary_contact_name")
	private String primaryName;
	
	@Column(name = "primary_contact_number")
	private long primaryPhoneNo;
	
	@Column(name = "primary_contact_relation")
	private String primaryRelation;
	
	@Column(name = "secondary_contact_name")
	private String secondaryName;
	
	@Column(name = "secondary_contact_number")
	private long secondaryPhoneNo;
	
	@Column(name = "secondary_contact_relation")
	private String secondaryRelation;
	
	public Employees() {}
	
	
	public Employees(int id, String name, String title, long phoneNo, String email, String address, String city,
			String state, String primaryName, long primaryPhoneNo, String primaryRelation, String secondaryName,
			long secondaryPhoneNo, String secondaryRelation) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.primaryName = primaryName;
		this.primaryPhoneNo = primaryPhoneNo;
		this.primaryRelation = primaryRelation;
		this.secondaryName = secondaryName;
		this.secondaryPhoneNo = secondaryPhoneNo;
		this.secondaryRelation = secondaryRelation;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPrimaryName() {
		return primaryName;
	}


	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}


	public long getPrimaryPhoneNo() {
		return primaryPhoneNo;
	}


	public void setPrimaryPhoneNo(long primaryPhoneNo) {
		this.primaryPhoneNo = primaryPhoneNo;
	}


	public String getPrimaryRelation() {
		return primaryRelation;
	}


	public void setPrimaryRelation(String primaryRelation) {
		this.primaryRelation = primaryRelation;
	}


	public String getSecondaryName() {
		return secondaryName;
	}


	public void setSecondaryName(String secondaryName) {
		this.secondaryName = secondaryName;
	}


	public long getSecondaryPhoneNo() {
		return secondaryPhoneNo;
	}


	public void setSecondaryPhoneNo(long secondaryPhoneNo) {
		this.secondaryPhoneNo = secondaryPhoneNo;
	}


	public String getSecondaryRelation() {
		return secondaryRelation;
	}


	public void setSecondaryRelation(String secondaryRelation) {
		this.secondaryRelation = secondaryRelation;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", title=" + title + ", phoneNo=" + phoneNo + ", email="
				+ email + ", address=" + address + ", city=" + city + ", state=" + state + ", primaryName="
				+ primaryName + ", primaryPhoneNo=" + primaryPhoneNo + ", primaryRelation=" + primaryRelation
				+ ", secondaryName=" + secondaryName + ", secondaryPhoneNo=" + secondaryPhoneNo + ", secondaryRelation="
				+ secondaryRelation + "]";
	}
	
	
	
	
}
