package com.jfsd.project.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback_the_giving_tree")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private double volunteerpickuprating;
	
	@Column
	private double donationproces;
	
	@Column
	private double overallrating;
	
	@Column
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public double getVolunteerpickuprating() {
		return volunteerpickuprating;
	}

	public void setVolunteerpickuprating(double volunteerpickuprating) {
		this.volunteerpickuprating = volunteerpickuprating;
	}

	public double getDonationproces() {
		return donationproces;
	}

	public void setDonationproces(double donationproces) {
		this.donationproces = donationproces;
	}

	public double getOverallrating() {
		return overallrating;
	}

	public void setOverallrating(double overallrating) {
		this.overallrating = overallrating;
	}

	public void setOverallrating(int overallrating) {
		this.overallrating = overallrating;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
	
	
}
