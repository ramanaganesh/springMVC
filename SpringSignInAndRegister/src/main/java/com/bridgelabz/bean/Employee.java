package com.bridgelabz.bean;

public class Employee 
{
	
	private int id;    
	private String name;    
	/*private float salary;    
	private String designation; */
	private String email;
	private String password;
	private String role;
	    
	public int getId() {    
	    return id;    
	}    
	public void setId(int id) {    
	    this.id = id;    
	}    
	public String getName() {    
	    return name;    
	}    
	public void setName(String name) {    
	    this.name = name;    
	}    
/*	public float getSalary() {    
	    return salary;    
	}    
	public void setSalary(float salary) {    
	    this.salary = salary;    
	}    
	public String getDesignation() {    
	    return designation;    
	}    
	public void setDesignation(String designation) {    
	    this.designation = designation;    
	}*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}  
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	    
}
