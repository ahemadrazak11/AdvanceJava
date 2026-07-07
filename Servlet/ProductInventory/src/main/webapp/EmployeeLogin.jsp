<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login</title>
</head>
<body>

<h1>Employee Login</h1>
<form action="customer-login">
Username: <input type="text" name="username"><br><br>
Password: <input type="text" name="password"><br><br>

<input type="submit" value="Login">

</form>



<%
HttpSession session2 = request.getSession();
String failed = (String) session2.getAttribute("failed");
String pass = (String) session2.getAttribute("pass");
%>

<% if(failed != null){ %>

<div id="notify_container" style="color: red;">
	<b id="message"><%= failed %></b>
</div>

<%
    // Remove the message after displaying it once
    session2.removeAttribute("failed");
%>

<% } 

else if(pass != null) { %>

<div id="notify_container" style="color: green;">
	<b id="message"><%= pass %></b>
</div>

<%
    // Remove the message after displaying it once
    session2.removeAttribute("pass");
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

</body>
</html>