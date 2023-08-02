package com.jfsd.project.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsd.project.springboot.model.Donation;
import com.jfsd.project.springboot.model.Volunteer;
import com.jfsd.project.springboot.repository.DonationRepository;
import com.jfsd.project.springboot.repository.VolunteerRepository;

@Service
public class VolunteerServiceImpl implements VolunteerService {

	@Autowired
	private VolunteerRepository volunteerRepository;
	
	@Autowired
	private DonationRepository donationRepository;
	
	public Volunteer checkvolunteerlogin(String uname, String pwd) {
		return volunteerRepository.checklogin(uname, pwd);
		
	
	}


	@Override
	public List<Donation> viewAllAssignedDonations(String username) {
		return (List<Donation>) donationRepository.Assigneddonation(username);
	}


	@Override
	public List<Volunteer> viewAllVolunteers() {
		 return (List<Volunteer>) volunteerRepository.findAll();
	}


	@Override
	public Volunteer addNewVolunteer(Volunteer volunteer) {
		
		
		return volunteerRepository.save(volunteer);
	}


	@Override
	public boolean isexist(String uname) {
		return volunteerRepository.existsById(uname);
	}

	
}
