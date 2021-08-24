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
	<h1>Add New Category</h1>
	<form:form action="new" method="post" modelAttribute="cats">
	
    <div class="form-group">
        <form:label path="cName">Category Name:</form:label>
        <form:errors path="cName"/>
        <form:input path="cName"/>
     </div>
 
    <input type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>