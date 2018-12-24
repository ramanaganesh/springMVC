package com.bridgelabz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bridgelabz.bean.Employee;


public class EmpDao 
{
	 
		JdbcTemplate template;    
		    
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		} 
		public int save(Employee p){ 
			//System.out.println(p);
		    String sql="insert into Emp99(name,email,password) values('"+p.getName()+"','"+p.getEmail()+"','"+p.getPassword()+"')";
		 //   System.out.println(sql);
//		    System.out.println(template);
		    return template.update(sql);    
		} 
		public List<Employee> getEmployees(){    
		    return template.query("select * from Emp99",new RowMapper<Employee>(){    
		        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
		            Employee e=new Employee();    
		            e.setId(rs.getInt(1));    
		            e.setName(rs.getString(2));    
		            e.setEmail(rs.getString(3));    
		            e.setPassword(rs.getString(4));    
		            return e;    
		        }    
		    });    
		}
}
