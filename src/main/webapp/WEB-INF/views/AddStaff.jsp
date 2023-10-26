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

<form action="/addnewstaff">

	<label for="firstName">First Name:</label><br>
	<input name="firstName" type="text"/><br>
	<label for="lastName">Last Name:</label><br>
	<input name="lastName" type="text"/><br>
	<label for="employeeId">Employee Id:</label><br>
	<input name="employeeId" type="text"/><br>
	<label for="phoneNumber">Phone Number:</label><br>
	<input name="phoneNumber" type="text"/><br>
	<label for="secondaryPhone">Secondary Phone Number:</label><br>
	<input name="secondaryPhone" type="text"/><br>
	<label for="role">Role:</label><br>
	<select name="role">
	<option value="RN">RN</option>
	<option value="ST">ST</option>
	<option value="TSA">TSA</option>
	<option value="PA">PA</option>
	<option value="CRNA">CRNA</option>
	<option value="MDA">MDA</option>
	<option value="AIDE">AIDE</option>
	</select>


	<br>
	<br> <input type="submit" value="Save New Employee"/>
	<br>
	<br> <input class="button" type="reset" value="Reset Form" />
</form>

</body>
</html>