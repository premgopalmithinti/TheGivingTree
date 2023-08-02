package com.jfsd.project.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsd.project.springboot.model.Admin;
import com.jfsd.project.springboot.model.Donation;
import com.jfsd.project.springboot.repository.AdminRepository;
import com.jfsd.project.springboot.repository.DonationRepository;

@Service
public class AdminServiceImpl implements AdminService
{

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private DonationRepository donationRepository;
	
	@Override
	public Admin checkadminlogin(String uname, String pwd)
	{
		
		return adminRepository.checkadminlogin(uname, pwd);
	}
	@Override
	public List<Donation> viewAllDonations() {
		
		 return (List<Donation>) donationRepository.findAll();
	}
	@Override
	public List<Donation> viewdonationsaccepted() {
		
		return (List<Donation>) donationRepository.accepteddonation();
	}
	
	@Override
	public List<Donation> viewdonationsdeclined() {
		
		return (List<Donation>) donationRepository.declineddonation();
	}
	
	@Override
	public List<Donation> viewdonationsonprogress() {
		
		return (List<Donation>) donationRepository.onprogressdonation();
	}
	
	@Override
	public List<Donation> viewdonationscompleted() {
		
		return (List<Donation>) donationRepository.completeddonation();
	}
	
	
	

}
