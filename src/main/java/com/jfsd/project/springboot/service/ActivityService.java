package com.jfsd.project.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsd.project.springboot.model.Activity;
import com.jfsd.project.springboot.repository.ActivityRepository;


public interface ActivityService {

	public void saveActivity(Activity activity);
	public List<Activity> getAllActivities();
	
	

	
	
}
