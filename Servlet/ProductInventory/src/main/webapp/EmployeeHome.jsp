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
		<h1>Employee Home</h1>
<hr>



<%
String message = (String) session1.getAttribute("message");
%>

<% if(message != null){ %>

<h2 id="message" style="color: green"><%= message %></h2>

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
}, 3000); 
</script>
<%
}
else{
%>
<h2 style="color:red;">username and password required......</h2>
<a href="CustomerLogin.jsp">Login</a>
<%
}
%>





<div>
<a href="">Get Product By ID</a>
</div>


<div>
<a href="">Get All Product</a>
</div>


<div>
<a href="AddProduct.jsp">Add Product</a>
</div>


<div>
<a href="UpdateProduct.jsp">Update Product</a>
</div>

<div>
<a href="">Delete Product</a>
</div>

</body>
</html>