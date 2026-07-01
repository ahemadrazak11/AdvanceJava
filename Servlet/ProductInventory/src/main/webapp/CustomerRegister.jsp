<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Portal</title>
</head>
<body>
<a href="Customer.jsp" style="text-decoration: none;">
<div style="width: 70px; height: 70px; background-color: navy; border-radius: 50%;">
<span style="color: white; font-size: 50px; padding: 10px">&leftarrow;</span>
</div>
</a>
<h1>Registration Form</h1>





<form action="customer">
Id: <input type="text" name="id"><br><br>
Name: <input type="text" name="name"><br><br>
Mobile: <input type="text" name="mobile"><br><br>
Email: <input type="text" name="email"><br><br>
Username: <input type="text" name="username"><br><br>
Password: <input type="text" name="password"><br><br>
<input type="submit" value="Register">
</form>

Alreadu have an account? <a href="CustomerLogin.jsp">Click here</a>





</body>
</html>