<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Update Product Page</h1>
<hr>

<%
	HttpSession session1 = request.getSession();
	
	String message1 = (String) session1.getAttribute("message1");
	String message2 = (String) session1.getAttribute("message2");
	
	if(message2 != null){
%>
<h1><%= message2 %></h1>

<% }%>

<form action="check-id">
Product ID: <input type="text" name="id"><br><br>
<input type="submit" value="Check">
</form>



<%	
	if(message1 != null){
%>
<h1><%= message1 %></h1>



<form action="UpdateOption.jsp">

<select name="option">
<option>Name</option>
<option>Brand</option>
<option>Price</option>
<option>Quantity</option>
</select>

<input type="submit" value="Update">


</form>


<% } %>


</body>
</html>