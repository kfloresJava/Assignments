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
<title>Show Questions</title>
</head>
<body>
<div class="container">
		<h1>Question Dashboard</h1>
		<table class="table table-dark">
		<thead>
			<th>Questions</th>
			<th>Tags</th>
		</thead>
		<tbody>
			 <c:forEach var="vals" items="${allVals}">
			 <tr>
   				<td><a href="questions/${vals.qID}">${vals.qDesc}</a></td>
   				<td><c:forEach var="tgs" items="${vals.tags}"><c:out value="${tgs.tDesc}"></c:out>, </c:forEach></td>
   			</tr>
  		   	</c:forEach>
  
		</tbody>
		</table>
		<a href="questions/new">Add New Question</a>
	</div>
	
</body>
</html>