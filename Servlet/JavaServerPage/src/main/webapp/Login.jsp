<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<%
HttpSession session1 = request.getSession();
String message = (String) session1.getAttribute("message");
%>

<% if(message != null){ %>

<h2 id="message" style="color: red"><%= message %></h2>

<%
    // Remove the message after displaying it once
    session1.removeAttribute("message");
%>

<% } %>

<form action="login">
    Username:
    <input type="text" name="username"><br><br>

    Password:
    <input type="password" name="password"><br><br>

    <input type="submit" value="Login">
</form>

<script>
setTimeout(function () {
    let msg = document.getElementById("message");

    if (msg != null) {
        msg.style.display = "none";
    }
}, 3000);   //
</script>

</body>
</html>