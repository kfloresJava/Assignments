<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IDEAS</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">

		<h1>${allVals.qDesc}</h1>
		<hr>
		<h2 style="float:left;">TAGS: </h2>
		 <c:forEach var="vals" items="${allVals.tags}">
		<p style="float:left; margin:2px;margin-top:10px; border:2px solid black; width:140px; text-align:center;height:auto;"><c:out value="${vals.tDesc}"></c:out></p> 
  		 </c:forEach>
  		 <div style="width:500px; height:auto;">
		<table class="table table-dark">
		<thead>
			<th>Answers</th>
		</thead>
		<tbody>
			 <c:forEach var="vals" items="${allVals.answers}">
			 <tr>
   				<td><c:out value="${vals.aDesc}"></c:out></td>
   			</tr>
  		   	</c:forEach>
  
		</tbody>
		</table>
		</div>
		<div style="width:500px; float:left;height:auto;">
		<h1>Add Your Answer</h1>
			<form action="newAns" method="post">
			
		    <div class="form-group">
		        <textarea name="adesc"></textarea>
		     </div>
		      <input type="hidden" name="qid" value="${allVals.qID}"/>
		    <input type="submit" value="Submit"/>
		</form>
		</div>
	</div>

</body>
</html>