<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
${message}
<form action="save"  method="post">
Name:<input type="text" name="name">
Email:<input type="email" name="email">
Password:<input type="password" name="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}">
<br>
<input type="submit" value="submit">  
</form>


<!-- <script>
	function validateForm()
	{
	var x=document.forms.myform.password.value;
	var regex;
	if(x.length<8)
		{
			alert("Password must contain 8 character");
			return false;
		}
	regex=/[0-9]/;
	if(!regex.test(x))
		{
			alert("Password must be contain atleast one number");
			return false;
		}
	regex=/[A-Z]/;
	if(!regex.test(x))
		{
			alert("Password must be contain atleast one upper case letter");
			return false;
		}
	regex=/[a-z]/;
	if(!regex.test(x))
		{
			alert("Password must be contain atleast one lower case letter");
			return false;
		}
	
	}
	</script> -->
</body>
</html>














<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Employee</h1>  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Name : </td>   
          <td><form:input type="text" path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Email :</td>    
          <td><form:input type="email" path="email" /></td>  
         </tr>   
         <tr>    
          <td>Password :</td>    
          <td><form:input type="password" path="password" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>     --%>
