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
<title><c:out value="${cProd.pName}"/></title>
</head>
<body>
<div class="container">
	<h1>${cats.cName}</h1>
		<hr>
    <p>
       Category Description:<c:out value="${cats.cName}"/>
    </p>
    <h2>PRODUCTS:</h2>
    	<c:forEach items="${cats.products}" var="prod">
    		<p>${prod.pName}</p>
    	</c:forEach>
  	<form action="addCat" method="post">
  	<input type="hidden" name="cID" value="${cats.cID}">
	<select name="prods">
		<c:forEach items="${prods}" var="prod">
			<c:choose>
			<c:when test="${!prod.categories.contains(cats)}">
				<option value="${prod.pID} ">${prod.pName} </option>
			</c:when>
			</c:choose>
		</c:forEach>
	</select>
	<button>ADD PRODUCT</button>
	</form>
   
	</div>

</body>
</html>