package in.igct.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.igct.binding.EnquiryForm;
import in.igct.binding.IGCTCourse;
import in.igct.service.CourseService;

@Controller
public class IndexController {
	
	@Autowired 	
	CourseService service;
	
  @Autowired   
  JavaMailSender sender;
	
	@GetMapping("/")
	public String indexPage()
	{
		return "index";
	}
	
	@GetMapping("/getCourse")
	
	public String getAll(Model m)
	{
		List<IGCTCourse> courses=service.getCourse();
		
		m.addAttribute("listofcorse",courses);
	
		System.out.println(courses);
		
		return "cors";
		
	}
	@GetMapping("/contact")
	
	public String contactPage()
	{
		return "contactus";
	}
	
	@GetMapping("/user")
	public String enquiryForm(Model m)
	{
		EnquiryForm usrForm=new EnquiryForm();
		
		List<String> courlist = Arrays.asList("BCA","DCA","PGDCA","BBA","DMLT","BMLT","BA CA","BCOM","Tally","BCOM CA","MA Hindi/English/Economics/Education","MSC Math/Computer");
		m.addAttribute("cour",courlist);
		
		m.addAttribute("blankform", usrForm);			
		
		return "enform";
		
	}
	
	/*
	 * @PostMapping("/register") public String
	 * submitForm(@ModelAttribute("blankform") EnquiryForm blankform,Model m) {
	 * System.out.println("submit form"); System.out.println(blankform);
	 * m.addAttribute("blankform",blankform); return "register_success"; }
	 */
	
	@PostMapping("/register")
	public String submitForm(HttpServletRequest req) {
		String fullname=req.getParameter("fullname");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String gender=req.getParameter("gender");
		String course=req.getParameter("course");
		String note=req.getParameter("note");
		
		SimpleMailMessage msg=new SimpleMailMessage();
		
	    msg.setFrom("vpnsoni426@gmail.com");
	    msg.setTo("ajithelpgmb@gmail.com");
	    
	    String mailSubject= fullname+" Student Enquiry Message";
	    
	    String mailContent="Sender Nams:"+fullname+ "\n";
	    mailContent+="sender Email :"+email+ "\n";
	    mailContent+="phone :"+phone+"\n";
	   
	    mailContent+="Gender :"+gender+"\n";
	    mailContent+="course :"+course+"\n";
	    mailContent+="Note :"+note+"\n";
	    
	    msg.setSubject(mailSubject);
	    msg.setText(mailContent);
	    
	    sender.send(msg);
	    
	    return "register_success";
	}

}
