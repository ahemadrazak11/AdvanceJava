<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Forgot Password</h1>





<form action="forgotpassword">
Email: <input type="text" name="email"><br><br>
<input type="submit" value="Submit">
</form>


<%
HttpSession session1 = request.getSession();
String message = (String) session1.getAttribute("message");
%>

<% if(message != null){ %>

<div style="color: red;">
<b id="message"><%= message %></b>
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



</body>
</html>