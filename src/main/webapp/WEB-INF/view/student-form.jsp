<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="studentModel">
	Enter First Name : <form:input path="firstName" />
	<br>
	Enter Last Name : <form:input path="lastName" />
	<br>
	<input type="submit" value="Register" />
	</form:form>

	

</body>
</html>