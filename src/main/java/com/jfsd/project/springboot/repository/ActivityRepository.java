package com.jfsd.project.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jfsd.project.springboot.model.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer>

{

}
