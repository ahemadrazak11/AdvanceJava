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


<form action="update-option">

<%
if(option.equals("Name")){
%>

Name: <input type="text" name="name"><br><br>
<input type="submit" value="update">

<%
} 
else if(option.equals("Brand"))
{
%>

Brand: <input type="text" name="brand"><br><br>
<input type="submit" value="update">

<%
} 
else if(option.equals("Price"))
{
%>

Price: <input type="text" name="price"><br><br>
<input type="submit" value="update">

<%
} 
else if(option.equals("Quantity"))
{
%>

Quantity: <input type="text" name="quantity"><br><br>
<input type="submit" value="update">


<%
}
%>
</form>


</body>
</html>