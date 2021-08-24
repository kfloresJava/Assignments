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
<title>NEW Product</title>
</head>
<body>
	<div class="container">
	<h1>Add New Product</h1>
	<form:form action="new" method="post" modelAttribute="prods">

    <div class="form-group">
        <form:label path="pName">Product Name:</form:label>
        <form:errors path="pName"/>
        <form:input path="pName"/>
     </div>
    <div class="form-group">
        <form:label path="description">Description:</form:label>
        <form:errors path="description"/>
        <form:input path="description"/>
     </div>
    <div class="form-group">
        <form:label path="price">Price:</form:label>
        <form:errors path="price"/>
        <form:input path="price"/>
 </div>
    <input type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>