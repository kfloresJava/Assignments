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
<title>My Programming Languages</title>
</head>
<body>
	
	<div class="container">
		<a href="languages/new">ADD NEW LANGUAGE</a>
		<table class="table table-dark">
		<thead>
			<th>Programming Language</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</thead>
		<tbody>
			 <c:forEach var="langs" items="${allL}">
			 <tr>
   				<td><a href="${langs.pID}">${langs.languageName}</a></td>
   				<td>${langs.languageCreator}</td>
   				<td>${langs.version}</td> 	
   				<td><a href="${langs.pID}/edit">EDIT</a>||<a href="${langs.pID}/delete">DELETE</a></td>	
   			</tr>
  		   	</c:forEach>
  
		</tbody>
		</table>
	</div>
	<div class="container">
	<h1>HTML</h1>
		<form action="/new" method="POST">
			<div class="form-group">
				<label for='languageName'>Language:</label>
				<input type="text" name="languageName">
			</div>
			<div class="form-group">
				<label for='languageCreator'>Creator:</label>
				<input type="text" name="languageCreator">
			</div>
			<div class="form-group">
				<label for='version'>Version:</label>
				<input type="text" name="version">
			</div>
			<button>SUBMIT</button>
		</form>
	</div>
</body>
</html>