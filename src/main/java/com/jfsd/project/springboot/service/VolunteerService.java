package com.jfsd.project.springboot.service;

import java.util.List;

import com.jfsd.project.springboot.model.Donation;
import com.jfsd.project.springboot.model.Volunteer;

public interface VolunteerService {

	public Volunteer checkvolunteerlogin(String uname, String pwd);
	public List<Donation> viewAllAssignedDonations(String usernamer);
	public List<Volunteer> viewAllVolunteers();
	
	public Volunteer addNewVolunteer(Volunteer volunteer);
	
	public boolean isexist(String uname);
}
