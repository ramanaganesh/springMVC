<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
${message}
<h1>Welcome to sign-in page</h1>
<%-- <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Email : </td>   
          <td><form:input  path="email"  /></td>  
         </tr> 
          <tr>    
          <td>Password : </td>   
          <td><form:input   path="password"  /></td>  
         </tr> 
        <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>  --%>    
 <form action="homepage" method="post">
Email:<input type="email" name="email">
Password:<input type="password" name="password">
<br>
<input type="submit" value="log-in"> 
<a href="register">Register</a>
</form>
</body>
</html>