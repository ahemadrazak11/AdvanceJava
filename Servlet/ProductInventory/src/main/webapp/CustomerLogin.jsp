<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Login</title>
</head>
<body>
<h1>Login</h1>
<hr>

<%
HttpSession session1 = request.getSession();
String failed = (String) session1.getAttribute("failed");
String pass = (String) session1.getAttribute("pass");
%>

<% if(failed != null){ %>

<div style="color: red;">
<b id="message"><%= failed %></b>
</div>

<%
    // Remove the message after displaying it once
    session1.removeAttribute("message");
%>

<% } 

else if(pass != null) { %>

<div style="color: green;">
<b id="message"><%= pass %></b>
</div>

<%
    // Remove the message after displaying it once
    session1.removeAttribute("message");
%>

<% } %>


<script>
setTimeout(function () {
    let msg = document.getElementById("message");

    if (msg != null) {
        msg.style.display = "none";
    }
}, 3000);   // 3000 ms = 3 seconds
</script>


<form action="login">

Username: <input type="text" name="username"><br><br>
Password: <input type="password" name="password"><br><br>
<input type="submit" value="Login">
</form>
<a href="ForgotPassword.jsp">Forgot Password?</a>
<a href="CustomerRegister.jsp">New User?</a>
</body>
</html>