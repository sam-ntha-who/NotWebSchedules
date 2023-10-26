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

<h2>Confirm New Schedule</h2>

	<label for="date">Date: ${date}</label><br>

	<label for="lastName">Name: ${staff.lastName}, </label><label for="firstName">${staff.firstName}</label><br>

	<label for="shift">Shift: ${shift.shiftLength} hours, ${shift.startTime} - ${shift.endTime}</label><br>

	<label for="role">Role: ${staff.role}</label><br>

<!-- TODO: add option to go back, delete, change value -->
	<br><br>
	<a href="/addschedule" class="button" type="text">Back</a>
</body>
</html>