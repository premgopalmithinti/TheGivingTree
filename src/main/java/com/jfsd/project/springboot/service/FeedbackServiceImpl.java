package com.jfsd.project.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsd.project.springboot.model.Feedback;
import com.jfsd.project.springboot.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;
	
	
	@Override
	public Feedback addFeedback(Feedback feedback) {
		
		return feedbackRepository.save(feedback);
	}


	@Override
	public double avgvolpickup() {
		return feedbackRepository.avgvolunteerpickuprating();
		
	}


	@Override
	public double donavg() {
		return feedbackRepository.avgoverallrating();
	}


	@Override
	public double dopavg() {
		return feedbackRepository.avgvdonationprocess();
	}

}
