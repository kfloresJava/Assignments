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
	<h1>${cPrd.pName}</h1>
		<hr>
    <p>
       ProductName:<c:out value="${cPrd.pName}"/>
    </p>
    <p>
       Product Description:<c:out value="${cPrd.description}"/>
    </p>
    <p>
       Product Price:<c:out value="${cPrd.price}"/>
    </p>
  	  <h2>CATEGORIES:</h2>
    	<c:forEach items="${cPrd.categories}" var="prod">
    		<p>${prod.cName}</p>
    	</c:forEach>
  	<form action="addCat" method="post">
  	<input type="hidden" name="pID" value="${cPrd.pID}">
	<select name="cats">
		<c:forEach items="${ccs}" var="prod">
			<c:choose>
			<c:when test="${!prod.products.contains(cPrd)}">
				<option value="${prod.cID}">${prod.cName} </option>
			</c:when>
			</c:choose>
		</c:forEach>
	</select>
	<button>ADD CATEGORY</button>
	</form>
   
	</div>

</body>
</html>