package com.jfsd.project.springboot.service;

import com.jfsd.project.springboot.model.Feedback;

public interface FeedbackService {

	public Feedback addFeedback(Feedback feedback);
	public double avgvolpickup();
	public double donavg();
	public double dopavg();
	
	
}
