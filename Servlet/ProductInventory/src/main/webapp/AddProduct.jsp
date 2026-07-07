<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add Product</h1>
<form action="add-product">
ID: <input type="text" name="id"><br><br>
Name: <input type="text" name="name"><br><br>
Price: <input type="text" name="price"><br><br>
Brand: <input type="text" name="brand"><br><br>
Quantity: <input type="text" name="quantity"><br><br>
<input type="submit" value="Add">
</form>



<%
HttpSession session1 = request.getSession();
String message = (String) session1.getAttribute("message");
%>

<% if(message != null){ %>

<div id="notify_container">
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