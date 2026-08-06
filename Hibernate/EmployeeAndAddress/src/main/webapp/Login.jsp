<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
    background:#f1f5f9;
}

.login-box{

    width:400px;
    background:white;
    padding:35px;
    border-radius:10px;
    box-shadow:0px 0px 10px rgba(0,0,0,.2);

}

.login-box h1{

    text-align:center;
    margin-bottom:25px;

}

.input-box{

    margin-bottom:18px;

}

label{

    display:block;
    margin-bottom:5px;
    font-weight:bold;

}

input{

    width:100%;
    padding:10px;
    border:1px solid gray;
    border-radius:5px;

}

button{

    width:100%;
    padding:12px;
    border:none;
    border-radius:5px;
    background:#0d6efd;
    color:white;
    font-size:18px;
    cursor:pointer;

}

button:hover{

    background:#084298;

}

.error{

    color:red;
    text-align:center;
    margin-bottom:15px;

}

</style>

</head>

<body>

<div class="login-box">

<h1>Employee Login</h1>

<%
String msg=(String)request.getAttribute("message");
if(msg!=null){
%>

<p class="error"><%=msg %></p>

<%
}
%>

<form action="login">

<div class="input-box">
<label>Email</label>
<input type="email" name="email" required>
</div>

<div class="input-box">
<label>Password</label>
<input type="password" name="password" required>
</div>

<button type="submit">Login</button>

</form>

</div>

</body>
</html>