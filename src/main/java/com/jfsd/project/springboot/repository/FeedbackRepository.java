package com.jfsd.project.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jfsd.project.springboot.model.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

	@Query(value = "select avg(volunteerpickuprating) from Feedback")
	public double avgvolunteerpickuprating();
	
	@Query(value = "select avg(donationproces) from Feedback")
	public double avgvdonationprocess();
	
	@Query(value = "select avg(overallrating) from Feedback")
	public double avgoverallrating();
}
