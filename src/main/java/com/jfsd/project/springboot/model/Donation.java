package com.jfsd.project.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DonationTheGivingTree")
public class Donation {

	
	@Id
	@GeneratedValue
    private int id;
	@Column
	private String fullname;
	@Column
	private String gender;
	@Column
	private String foodDetails;
	@Column
	private String phoneNumber;
	@Column
	private String mail;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String status;
	
	@Column
	private String assignedvolunteer;
	
	
	
	public String getAssignedvolunteer() {
		return assignedvolunteer;
	}
	public void setAssignedvolunteer(String assignedvolunteer) {
		this.assignedvolunteer = assignedvolunteer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFoodDetails() {
		return foodDetails;
	}
	public void setFoodDetails(String foodDetails) {
		this.foodDetails = foodDetails;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
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
	@Override
	public String toString() {
		return "Donation [id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", foodDetails=" + foodDetails
				+ ", phoneNumber=" + phoneNumber + ", mail=" + mail + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", status=" + status + ", assignedvolunteer=" + assignedvolunteer + "]";
	}

	
	
	
	
	
}
