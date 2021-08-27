<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
    <h1>Register!</h1>
    
    <p><form:errors path="user.*"/></p>
    
    <form:form method="POST" action="/registration" modelAttribute="user">
        <p>
            <form:label path="uEmail">Email:</form:label>
            <form:input type="email" path="uEmail"/>
        </p>
        <p>
            <form:label path="uPass">Password:</form:label>
            <form:password path="uPass"/>
        </p>
        <p>
            <form:label path="uPass2">Password Confirmation:</form:label>
            <form:password path="uPass2"/>
        </p>
        <input type="submit" value="Register!"/>
    </form:form>
    
</body>
</html>