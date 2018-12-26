package com.bridgelabz.controller;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bridgelabz.bean.Employee;
import com.bridgelabz.dao.EmpDao;

@Controller
public class sample 
{
 @Autowired 
EmpDao employee;
 
@RequestMapping("/signin")	
String signIn()	
{
	return "signinform";
}

@RequestMapping("/register")	
String register()
{
	return "registerform";
}

@RequestMapping("/homepage")
String homePage(@ModelAttribute("emp") Employee emp,Model model)
{
		//System.out.println(emp);
	   int flag=0;
	   ArrayList<Employee> list=(ArrayList<Employee>) employee.getEmployees();
	  // System.out.println(list.isEmpty()+" "+list.size());
	   if(!list.isEmpty())
	   {
		   for (int i = 0; i < list.size(); i++) 
		   {
			   	//  System.out.println(i+" "+list.size());
			   	// System.out.println(list.get(i).getPassword()+" "+list.get(i).getEmail());
			   if(emp.getPassword().equals(list.get(i).getPassword()) && emp.getEmail().equals(list.get(i).getEmail()))
			   {
				   flag=1;
				   // System.out.println(i+" IHIHI");
				   if(list.get(i).getRole().equals("user"))
					   return "homepage";
				   else if(list.get(i).getRole().equals("admin"))
				   {
					   model.addAttribute("name", list.get(i).getName());
					   return "adminpage";
				   }
			   }
		   }
		   if(flag==0)
		   {
			   //  System.out.println("hi");
			   String msg="Sorry, Re-enter the mail and password please sign-in again with validate mail and password";
			   model.addAttribute("message", msg);
			   return "signinform";
		   }
	   }
	   		String msg="Sorry user, You are the first register please register ur account";
	   		model.addAttribute("message", msg);
	   		return "signinform"; 
}
@RequestMapping(value="/save",method = RequestMethod.POST)
String addEmployee(@ModelAttribute("emp") Employee emp,Model model)
{
	//System.out.println(emp);
	boolean check=emailValidation(emp);
	if(check)
	{
		employee.save(emp);
		return "redirect:index.jsp";
	}
	 	String msg="Sorry user, Email is already exist...!";
	 	model.addAttribute("message", msg);
	 	return "registerform"; 
}

private boolean emailValidation(Employee emp) 
{
	   ArrayList<Employee> list=(ArrayList<Employee>) employee.getEmployees();
	   for (int i = 0; i < list.size(); i++) 
	   {
		   if(list.get(i).getEmail().equals(emp.getEmail()))
		   {
			   return false;
		   }
	   }
	   return true;
}
}
