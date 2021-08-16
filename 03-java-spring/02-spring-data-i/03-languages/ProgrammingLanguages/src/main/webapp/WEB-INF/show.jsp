<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Language</title>
</head>
<body>
<div class="container">
	<h1><a href="/languages">DashBoard</a></h1>
		<h1>Show Language</h1>
		<hr>
    <p>
       Language:<c:out value="${pls.languageName}"/>
    </p>
    <p>
       Creator:<c:out value="${pls.languageCreator}"/>
    </p>
    <p>
       Version:<c:out value="${pls.version}"/>
    </p>
	<h3><a href="${pls.pID}/edit">EDIT</a>||<a href="${pls.pID}/delete">DELETE</a></h3>
	</div>
</body>
</html>