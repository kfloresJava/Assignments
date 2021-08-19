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
<title>NEW NINJA</title>
</head>
<body>
	<div class="container">
	<h1>Add New Ninja</h1>
	<form:form action="Addnew" method="post" modelAttribute="nins">
	<form:select path="mDojo">
		<c:forEach items="${allDojo}" var="dojos">
			<option value="${dojos.dID} ">${dojos.dName} </option>
		</c:forEach>
	</form:select>
    <div class="form-group">
        <form:label path="firstName">FirstName:</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
     </div>
    <div class="form-group">
        <form:label path="lastName">LastName:</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
     </div>
    <div class="form-group">
        <form:label path="age">Age:</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>
 </div>
    <input type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>