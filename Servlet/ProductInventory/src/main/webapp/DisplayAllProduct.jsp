<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Product List</title>
<style>

table, th, td{
border: 1px solid black;
  border-collapse: collapse;
}

th{
background-color: #D6EEEE;
}
tr:nth-child(even) {
  background-color: #D6EEEE;
}
</style>
</head>
<body>

<% ResultSet query = (ResultSet) session.getAttribute("ResultSet"); %>


<table>
	<thead>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Brand</th>
			<th>Quantity</th>
		<tr>
	</thead>
	<tbody>



<%
while(query.next()){%>
		<tr>
			<td><%= query.getInt(1) %></td>
			<td><%= query.getString(2) %></td>
			<td><%= query.getDouble(3) %></td>
			<td><%= query.getString(4) %></td>
			<td><%= query.getInt(5) %></td>
		</tr>
	
<%} %>
</tbody>
</table>
</body>
</html>