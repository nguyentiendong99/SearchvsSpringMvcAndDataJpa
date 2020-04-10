<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Result</title>
</head>
<body>
<div align="center">
		<h1>Search Result</h1>
		<form method="get" action="search">
			<input type="text" name="keyword"/>
			<input type="submit" name="Search"/>
		</form>
		<br>
		<h3><a href = "new" >New Custormer</a></h3>
		<br>
		<hr>
		<table border="1" cellpadding="10">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
		</tr>
		<c:forEach items = "${list}" var = "custormer">
		<tr>
			<td>${custormer.id}</td>
			<td>${custormer.name}</td>
			<td>${custormer.email}</td>
			<td>${custormer.address}</td>
		</tr>

	</c:forEach>
	</table>

	</div>
</body>
</html>