package com.bridgelabz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleProgram 
{
	@RequestMapping("/hello1")
	String displayUser()
	{
		System.out.println("user");
		return "user";
	}
	
	@RequestMapping("/hello2")
	String displayAdmin()
	{
		System.out.println("admin");
		return "admin";
	}
	
	@RequestMapping("/hello3")
	String displayHome()
	{
		System.out.println("home");
		return "index1";
	}
}
