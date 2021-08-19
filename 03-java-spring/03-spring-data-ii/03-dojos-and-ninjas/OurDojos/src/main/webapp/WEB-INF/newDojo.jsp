<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NEW DOJO</title>
</head>
<body>
<div class="container">
	<h1>Add New DOJO</h1>
	<form:form action="/dojo/new" method="post" modelAttribute="dojox">
	
    <div class="form-group">
        <form:label path="dName">Dojo Name:</form:label>
        <form:errors path="dName"/>
        <form:input path="dName"/>
     </div>
 
    <input type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>