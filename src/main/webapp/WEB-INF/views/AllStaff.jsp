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

<h2>All Current Staff</h2>
<table class="table" style="">
		<thead>
			<tr class="columns">
				<th></th>
				<th><h3>First Name</h3></th>
				<th><h3>Last Name</h3></th>
				<th><h3>Employee Id</h3></th>
				<th><h3>Role</h3></th>
				<th><h3>Phone Number</h3></th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${staff}" var="staff" varStatus="status">
				<tr>
					<th scope="row">
					<td>${staff.firstName}</td>
					<td>${staff.lastName}</td>
					<td>${staff.employeeId}</td>
					<td>${staff.role}</td>
					<td>${staff.phoneNumber}</td>		
				</tr>
			</c:forEach>
		</tbody>
	</table>
<br>
<br>
<a href="/" class="button">Home</a>
<!-- TODO: add option to go back, update value -->
	
</body>
</html>