package com.bridgelabx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloProgram 
{
	   
	@RequestMapping("/welcome")  
	public String reDirect()  
	{  
		  return "welcome";
	}  
}
