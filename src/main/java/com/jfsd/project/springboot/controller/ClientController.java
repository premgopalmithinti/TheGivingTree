package com.jfsd.project.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.jfsd.project.springboot.model.Activity;
import com.jfsd.project.springboot.model.Admin;
import com.jfsd.project.springboot.model.Donation;
import com.jfsd.project.springboot.model.EmailMessage;
import com.jfsd.project.springboot.model.Feedback;
import com.jfsd.project.springboot.model.Volunteer;
import com.jfsd.project.springboot.repository.DonationRepository;
import com.jfsd.project.springboot.service.ActivityService;
import com.jfsd.project.springboot.service.AdminService;
import com.jfsd.project.springboot.service.DonationService;
import com.jfsd.project.springboot.service.EmailSenderService;
import com.jfsd.project.springboot.service.FeedbackService;
import com.jfsd.project.springboot.service.VolunteerService;

@Controller
public class ClientController 
{
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private VolunteerService volunteerService;
	
	@Autowired
	private DonationService donationService;

	@Autowired
	private ActivityService activityService;
	
	@Autowired
	private EmailSenderService emailSenderService;
	
	@Autowired
	private FeedbackService feedbackServicel;
	
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv = new ModelAndView("adminlogin");
		
		return mv;
	}
	
	@GetMapping("/volunteerlogin")
	public ModelAndView volunteerindemo()
	{
		ModelAndView mv = new ModelAndView("VolunteerLogin");
		
		return mv;
	}
	
	@GetMapping("/feedbackform")
	public ModelAndView feedbackformdemo()
	{
		ModelAndView mv = new ModelAndView("Feedbackform");
		return mv;
	}
	
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv = new ModelAndView("adminhome");
		
		List<Donation> donlist = adminService.viewAllDonations();
		double volavg = feedbackServicel.avgvolpickup();
		double donavg = feedbackServicel.donavg();
		double dopavg = feedbackServicel.dopavg();
		
		mv.addObject("volavg", volavg);
		mv.addObject("donavg", donavg);
		mv.addObject("dopavg", dopavg);
		mv.addObject("donlist", donlist);
		
		return mv;
	}

	
	@GetMapping("/logoutadmin")
	public String logoutAdmin()
	{
		return "redirect:/adminlogin";
	}
	
	@GetMapping("/AcceptedDonationsAdmin")
	public ModelAndView AcceptedDonationsAdmindemo()
	{
		ModelAndView mv = new ModelAndView("AcceptedDonations");
		
		List<Donation> donlist = adminService.viewdonationsaccepted();
		
		mv.addObject("donlist", donlist);
		
		return mv;
	}
	
	@GetMapping("/VolunteerList")
	public ModelAndView VolunteerListAdmindemo()
	{
		ModelAndView mv = new ModelAndView("VolunteerList");
		
		List<Volunteer> volist = volunteerService.viewAllVolunteers();
		
		mv.addObject("volistt", volist);
		
		return mv;
	}
	
	@GetMapping("/DeclinedDonationsAdmin")
	public ModelAndView DeclinedDonationsAdmindemo()
	{
		ModelAndView mv = new ModelAndView("DeclinedDonations");
		
		List<Donation> donlist = adminService.viewdonationsdeclined();
		
		mv.addObject("donlist", donlist);
		
		return mv;
	}
	
	///OnProgressAdmin
	@GetMapping("/OnProgressAdmin")
	public ModelAndView OnProgressAdmindemo()
	{
		ModelAndView mv = new ModelAndView("OnProgressDonations");
		
		List<Donation> donlist = adminService.viewdonationsonprogress();
		mv.addObject("donlist", donlist);
		List<Volunteer> vonlist = volunteerService.viewAllVolunteers();
		mv.addObject("vonlist", vonlist);
		
		
		return mv;
	}
	
	//CompletedAdmin
	@GetMapping("/CompletedAdmin")
	public ModelAndView CompletedAdmindemo()
	{
		ModelAndView mv = new ModelAndView("completedDonations");
		
		List<Donation> donlist = adminService.viewdonationscompleted();
		
		mv.addObject("donlist", donlist);
		
		return mv;
	}
	
	@GetMapping("/newdonation")
	public ModelAndView newdonationdemo()
	{
		ModelAndView mv = new ModelAndView("newdonation", "don", new Donation());
		return mv;
	}
	
	@GetMapping("/newVolunteer")
	public ModelAndView newVolunteerdemo()
	{
		ModelAndView mv = new ModelAndView("newvolunteer", "von", new Volunteer());
		return mv;
	}
	
	@PostMapping("/adddonation")
	public ModelAndView adddonationdemo(@ModelAttribute("don")Donation donation)
	{
		String gender;
		if(donation.getGender()=="male")
		{
			gender = "Mr.";
		}
		else if (donation.getGender()=="female")
		{
			gender = "Ms.";
		}
		else
		{
			gender = "Mr/Ms.";
		}
		String subjectMail ="Thank You For Donation";
		String subjectMessage = gender + donation.getFullname()+",\n"+ "We had sucessfully recived your donation request.\n\nOur team will contact to the phone no: "+donation.getPhoneNumber()+"\n\n Food Details : \n"+donation.getFoodDetails()+"\n\nYour Location: \n"+donation.getAddress()+",\n"+donation.getCity()+".";
		
		
		this.emailSenderService.sendEmail(donation.getMail(), subjectMail, subjectMessage );
		donationService.adddonation(donation);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ThankYouScreen");
		return mv;
	}
	
	@PostMapping("submitfeedback")
	public String submitfeedbackdemo(@ModelAttribute("fed")Feedback feedback)
	{
		feedbackServicel.addFeedback(feedback);
		return "redirect:/";
		
	}
	
	@PostMapping("addnewvolunteer")
	public ModelAndView addnewvolunteerdemo(@ModelAttribute("von")Volunteer volunteer)
	{
		if(!volunteerService.isexist(volunteer.getUsername()))
		{
			String gender;
			if(volunteer.getGender()=="male")
			{
				gender = "Mr.";
			}
			else if (volunteer.getGender()=="female")
			{
				gender = "Ms.";
			}
			else
			{
				gender = "Mr/Ms.";
			}
			String subjectMail ="Welcome To The Giving Tree Organization";
			
			
			String subjectMessage = gender + volunteer.getFullname()+",\n"+ "\nAccount Details\n\nuserid : "+volunteer.getUsername()+"\nPassword : "+volunteer.getPassword();
			
			
			this.emailSenderService.sendEmail(volunteer.getMail(), subjectMail, subjectMessage );
			volunteerService.addNewVolunteer(volunteer);
			ModelAndView mv = new ModelAndView();
			mv.setViewName("VolunteerList");
			return mv;
		}
		else
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("newvolunteer");
			mv.addObject("msg", "Username already taken!");
			return mv;
		}
		
		
	}
	
	

	
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String auname = request.getParameter("auname");
		String apwd = request.getParameter("apwd");
		
		Admin admin =  adminService.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{
			
			HttpSession session = request.getSession();
			
			
			List<Donation> donlist = adminService.viewAllDonations();
			
			mv.addObject("donlist", donlist);
			mv.setViewName("redirect:adminhome");
			
		}
		else
		{
			mv.setViewName("adminlogin");
			mv.addObject("msg", "Login Failed");
		}
		
		return mv;
	}
	
	@PostMapping("/checkvolunteerlogin")
	public ModelAndView checkvolunteerlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String auname = request.getParameter("auname");
		String apwd = request.getParameter("apwd");
		
		Volunteer volunteer =  volunteerService.checkvolunteerlogin(auname, apwd);
		
		if(volunteer!=null)
		{
			
			HttpSession session = request.getSession();
			
			
			List<Donation> donlist = volunteerService.viewAllAssignedDonations(auname);
			
			mv.addObject("donlist", donlist);
			mv.setViewName("volunteerhome");
			
		}
		else
		{
			mv.setViewName("VolunteerLogin");
			mv.addObject("msg", "Login Failed");
		}
		
		return mv;
	}
	
	@PostMapping("/updateStatus")
	public String updateStatuDonation(@ModelAttribute("donn") Donation donation)
	{
		
		String subjectMail = "Update on your Donation Request";
		String subjectMessage = "---------------------------------------------\nyour Donation Status : "+donation.getStatus()+"\n---------------------------------------------";
		
		donationService.adddonation(donation);
		this.emailSenderService.sendEmail(donation.getMail(), subjectMail, subjectMessage );
		return "redirect:/adminhome";
	}
	
	@PostMapping("/updateStatusonpr")
	public String updateStatusonprDonation(@ModelAttribute("donn") Donation donation)
	{
		
		String subjectMail = "Update on your Donation Request";
		String subjectMessage = "---------------------------------------------\nyour Donation Status : "+donation.getStatus()+"\n---------------------------------------------\nAssigned Volunteer : "+donation.getAssignedvolunteer()+"\nPick Up Address: "+donation.getAddress();
		
		donationService.adddonation(donation);
		this.emailSenderService.sendEmail(donation.getMail(), subjectMail, subjectMessage );
		return "redirect:/adminhome";
	}
	
	
	@PostMapping("/updateStatusVolunteer")
	public String updateStatuDonationVolunteer(@ModelAttribute("donn") Donation donation)
	{
		
		String subjectMail = "Update on your Donation Request";
		String subjectMessage = "---------------------------------------------\nyour Donation Status : "+donation.getStatus()+"\n---------------------------------------------";
		
		donationService.adddonation(donation);
		this.emailSenderService.sendEmail(donation.getMail(), subjectMail, subjectMessage );
		return "volunteerhome";
	}
	
	@PostMapping("/postsaveactivity")
	public String postsaveactivitydemo(@ModelAttribute("act")Activity activity)
	{

		activityService.saveActivity(activity);
		return "redirect:/adminActivities";
	}
	
	@GetMapping("/Activitiesadmin")
	public ModelAndView adminActivitiesdemo()
	{
		ModelAndView mv = new ModelAndView();
		
		List<Activity> alist = activityService.getAllActivities();
		mv.addObject("actlist", alist);
		mv.setViewName("adminActivities");
		
		return mv;
		
		
	}
	
	@GetMapping("/adminactivityform")
	public ModelAndView adminactivityformdemo()
	
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("activityForm");
		return mv;
		
		
	}
	
//	@PostMapping("/send-email")
//	public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage)
//	{
//		this.emailSenderService.sendEmail(emailMessage.getTo(), emailMessage.getSubject(),emailMessage.getMessage() );
//		return ResponseEntity.ok("Sucess");
//	}
//	

}
