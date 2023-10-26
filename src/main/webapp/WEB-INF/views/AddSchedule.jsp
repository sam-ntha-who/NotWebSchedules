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

<form action="/addnewschedule">

<table class="table" style="">
	<thead>
		<tr class="columns">
		<th></th>
		<th><h3>Date</h3></th>
		<th><h3>Name</h3></th>
		<th><h3>Shift</h3></th>		
		</tr>
	</thead>
	
	<tbody>
		<tr>
			<th scope="row">
				<td>
					<input name="date" type="text"/><br>
				</td>
			
				<td>
					<select name="employeeId">
						<c:forEach items="${staff}" var="staff">
							<option value="${staff.employeeId}" id="employeeId">${staff.lastName}, ${staff.firstName}</option>		
						</c:forEach>
					</select>
				</td>
				<td>
					<select name="shiftId">
						<c:forEach items="${shift}" var="shift">
							<option value="${shift.shiftId}" id="shiftId">${shift.startTime} - ${shift.endTime}</option>		
						</c:forEach>
					</select>
				</td>
		</tr>
	</tbody>
</table>

	<br>
	<br> <input type="submit" value="Save New Shift"/>
	<br>
	<br> <input class="button" type="reset" value="Reset Form"/>
</form>

</body>
</html>