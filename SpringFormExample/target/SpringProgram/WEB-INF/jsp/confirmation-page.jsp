<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>  
<html>  
<body>  
<p>Your reservation is confirmed successfully. Please, re-check the details.</p>  
First Name : ${reservation.firstName} <br>  
Last Name : ${reservation.lastName} <br>  
Gender: ${reservation.gender}<br>  
Meal:   
<ul>  
<c:forEach var="meal" items="${reservation.food}">  
<li>${meal.food}</li>  
</c:forEach>  
</ul>   
  
  
<form:form action="home" modelAttribute="reservation">  
<input type="submit" value="OK">
</form:form>
</body>  

</html>  