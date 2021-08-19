<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css">
<title>Show Dojo</title>
</head>
<body>
<div class="container">
		<h1><c:out value="${sDojo.dName}"/></h1>
		<table class="table table-dark">
		<thead>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Age</th>
		</thead>
		<tbody>
			 <c:forEach var="nins" items="${sDojo.ninjas}">
			 <tr>
   				<td>${nins.firstName}</td>
   				<td>${nins.lastName}</td>
   				<td>${nins.age}</td> 		
   			</tr>
  		   	</c:forEach>
  
		</tbody>
		</table>
	</div>
	
</body>
</html>