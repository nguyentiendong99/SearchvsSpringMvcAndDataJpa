<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
		<h1>Custormer Manager</h1>
		<form method="get" action="search">
			<input type="text" name="keyword"/>
			<input placeholder="Tim kiem ...." type="submit" value="Search"/>
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
			<th>Action</th>
		</tr>
		<c:forEach items = "${list}" var = "custormer">
		<tr>
			<td>${custormer.id}</td>
			<td>${custormer.name}</td>
			<td>${custormer.email}</td>
			<td>${custormer.address}</td>
			<td>
			<a href="edit?id=${custormer.id}">Edit</a>
			&nbsp;&nbsp;&nbsp;
			<a href="delete?id=${custormer.id}">Delete</a>
			</td>
		</tr>

	</c:forEach>
	</table>

	</div>
</body>
</html>