package com.jfsd.project.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jfsd.project.springboot.model.Donation;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Integer> 
{

	@Query("SELECT t from Donation t where t.status = 'Accepted'")
	public List<Donation> accepteddonation();
	
	@Query("SELECT t from Donation t where t.status = 'Denied'")
	public List<Donation> declineddonation();
	
	//declineddonation
	@Query("SELECT t from Donation t where t.status = 'On Progress'")
	public List<Donation> onprogressdonation();
	
	@Query("SELECT t from Donation t where t.status = 'Completed'")
	public List<Donation> completeddonation();
	
	@Query("SELECT t from Donation t where t.assignedvolunteer =?1")
	public List<Donation> Assigneddonation(String username);
}
