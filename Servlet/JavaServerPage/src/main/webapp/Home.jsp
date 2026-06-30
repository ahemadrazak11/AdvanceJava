<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
HttpSession session1 = request.getSession();
String username = (String) session1.getAttribute("username");
String password = (String) session1.getAttribute("password");
%>

<%
if(username != null && password != null)
{
%>
<h1 style="color:green;">Login Success!.....</h1>
<%
}
else{
%>
<h2 style="color:red;">username and password required......</h2>
<a href="Login.jsp">Login</a>
<%
}
%>


</body>
</html>