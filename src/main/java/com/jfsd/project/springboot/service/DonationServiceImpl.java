package com.jfsd.project.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsd.project.springboot.model.Donation;
import com.jfsd.project.springboot.repository.DonationRepository;


@Service
public class DonationServiceImpl implements DonationService{

	@Autowired
	private DonationRepository donationRepository;
	@Override
	public Donation adddonation(Donation donation) {
		
		
		return donationRepository.save(donation);
		
		
	}


}
