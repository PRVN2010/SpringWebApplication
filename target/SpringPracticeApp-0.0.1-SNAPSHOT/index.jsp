<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<% request.setAttribute("name", "Naveen"); %>
		<c:url value="/showMessage.html" var="messageUrl" />
		<a href="initHome.do">Click to enter</a>
		<% String name = "praveen"; %>
		<%=name %>
		${name}
	</body>
</html>
