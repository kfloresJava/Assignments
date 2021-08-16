<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<div class="container">
	<h1><a href="/languages">DashBoard</a></h1>
		<h1>Edit Language</h1>
<form:form action="/${pID}/edit" method="post" modelAttribute="pls">
    <p>
        <form:label path="languageName">Language:</form:label>
        <form:errors path="languageName"/>
        <form:input path="languageName"/>
    </p>
    <p>
        <form:label path="languageCreator">Creator:</form:label>
        <form:errors path="languageCreator"/>
        <form:textarea path="languageCreator"/>
    </p>
    <p>
        <form:label path="version">Version:</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>
    </p>
    
    <input type="submit" value="Submit"/>
    <h3><a href="/${pID}/delete">DELETE</a></h3>
</form:form>

	</div>
</body>
</html>