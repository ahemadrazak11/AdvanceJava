<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
	padding:0px;
	margin: 0px;
	box-sizing: border-box;
	}
	body{
		padding: 20px;
		background-color: lightgray;
	}
	h1{
		font-size: 35px;
		text-align: center;
	}
	
	#container{
		width: 300px;
		height: 400px;
		padding: 10px;
		margin: auto;
		margin-top: 50px;
		border-radius: 10px;
		background-color: gray;
	}
	
	a{
	text-decoration: none;
	}
	.btn{
		    font-size: 30px;
    height: 50px;
    text-align: center;
    margin-top: 83px;
    color: white;
    background-color: navy;
    border-radius: 10px;
    padding: 6px;
    cursor: pointer;
	}
	
	.btn:hover{
		color: navy;
		background-color: transparent;
		border: 2px solid navy;
	}
</style>
</head>
<body>

<h1>Customer Portal</h1>
<hr>

<%
HttpSession session1 = request.getSession();
String message = (String) session1.getAttribute("message");
%>

<% if(message != null){ %>

<h2 id="message" style="color: green"><%= message %></h2>

<%
    // Remove the message after displaying it once
    session1.removeAttribute("message");
%>

<% } %>

<div id="container">
	<a href="CustomerLogin.jsp">
		<div class="btn">Login</div>
	</a>
	
	<a href="CustomerRegister.jsp">
		<div class="btn">Register</div>
	</a>
</div>

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