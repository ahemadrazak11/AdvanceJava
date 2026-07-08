<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Options</title>
</head>
<body>

<% 
String option = request.getParameter("option");
%>

<%
if(option.equals("Name")){
%>

<form action="update-option">
Name: <input type="text" name="name"><br><br>
<input type="submit" value="update">

<%
} 
else if(option.equals("Brand"))
{
%>

<form action="update-option">
Brand: <input type="text" name="brand"><br><br>
<input type="submit" value="update">

<%
} 
else if(option.equals("Price"))
{
%>
<form action="update-option">
Price: <input type="text" name="price"><br><br>
<input type="submit" value="update">

<%
} 
else if(option.equals("Quantity"))
{
%>

<form action="update-option">
Quantity: <input type="text" name="quantity"><br><br>
<input type="submit" value="update">


<%
}
%>

</form>
</body>
</html>