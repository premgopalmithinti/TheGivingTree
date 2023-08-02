package com.jfsd.project.springboot.service;

public interface EmailSenderService {

	public void sendEmail(String to, String subject, String message);
	
}
