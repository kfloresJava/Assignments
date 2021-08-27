<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Questions</title>
</head>
<body>
<div class="container">
	<h1>New Question</h1>
	<form action="new" method="post">
	
    <div class="form-group">
        <label>Question Description:</label>
        <textarea name="qdesc"></textarea>
     </div>
       <div class="form-group">
 		<label>Question Tags:</label>
        <input type="text" name="tgs">
     </div>
    <input type="submit" value="Submit"/>
</form>
</div>
</body>
</html>