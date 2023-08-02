package com.jfsd.project.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jfsd.project.springboot.model.Volunteer;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, String>{

	@Query("select a from Volunteer a where username=?1 and password=?2")
	public Volunteer checklogin(String uname, String pwd);

	
	
}
