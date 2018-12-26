package com.bridgelabz.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.bridgelabz.bean.Employee;
import com.bridgelabz.controller.AES;


public class EmpDao 
{
		private String key;
		
		JdbcTemplate template;    
		   
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		} 
		public void setKey(String key) {
			this.key = key;
		}
		public int save(Employee p){ 
			//System.out.println(p);
			String encryptedPassword=AES.encrypt(p.getPassword(), key);
		    String sql="insert into Emp99(name,email,password,role) values('"+p.getName()+"','"+p.getEmail()+"','"+encryptedPassword+"','"+p.getRole()+"')";
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
		            String decryptPassword=AES.decrypt(rs.getString(4),key);
		          //System.out.println(decryptPassword);
		            e.setPassword(decryptPassword); 
		            e.setRole(rs.getString(5));
		          //System.out.println(e);
		            return e;    
		        }    
		    });    
		}
}
