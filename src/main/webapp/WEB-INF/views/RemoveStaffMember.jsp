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

<h2>This is not web schedules</h2>

<form action="/removestaff">

	<label for="employeeId">Employee Id:</label><br>
	<input name="employeeId" type="text"/><br>

<!-- add hidden input to pass employee model to confirmation page -->
<%-- <input type="hidden" id="storyName" name="storyName"
					value="${title}"> --%>
	<br>
	<br> <input type="submit" value="Remove Employee"/>
	<br>
	<br> <input class="button" type="reset" value="Reset Form" />
</form>

</body>
</html>