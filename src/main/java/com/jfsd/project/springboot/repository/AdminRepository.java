package com.jfsd.project.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jfsd.project.springboot.model.Admin;
import com.jfsd.project.springboot.model.Donation;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String>{

	@Query("select a from Admin a where username=?1 and password=?2")
	public Admin checkadminlogin(String uname, String pwd);

	

}
