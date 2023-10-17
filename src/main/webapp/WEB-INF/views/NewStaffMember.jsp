<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NotWebSchedules</title>
</head>
<body>

<h2>Confirm New Staff Member Information</h2>

	<label for="firstName">First Name: ${firstName}</label><br>

	<label for="lastName">Last Name: ${lastName}</label><br>

	<label for="employeeId">Employee Id: ${employeeId}</label><br>

	<label for="phoneNumber">Phone Number: ${phoneNumber}</label><br>

	<label for="secondaryPhone">Secondary Phone Number: ${secondaryPhone}</label><br>

	<label for="role">Role: ${role}</label><br>

<!-- TODO: add option to go back, delete, change value -->
	<br><br>
	<a href="/addstaff" class="button" type="text">Back</a>
</body>
</html>