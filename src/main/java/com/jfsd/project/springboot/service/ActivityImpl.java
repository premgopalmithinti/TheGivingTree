package com.jfsd.project.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsd.project.springboot.model.Activity;
import com.jfsd.project.springboot.repository.ActivityRepository;

@Service
public class ActivityImpl implements ActivityService {

	@Autowired
	private ActivityRepository activityRepository;
	
	@Override
	public void saveActivity(Activity activity) {
		activityRepository.save(activity);
		

	}

	@Override
	public List<Activity> getAllActivities() {
		return activityRepository.findAll();
		
	}

}
