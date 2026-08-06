<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>

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
    background:linear-gradient(135deg,#4F46E5,#7C3AED);
}

.card{

    width:380px;
    background:white;
    padding:40px;
    border-radius:15px;
    text-align:center;
    box-shadow:0px 10px 30px rgba(0,0,0,.25);

}

.card h1{

    color:#333;
    margin-bottom:15px;

}

.card p{

    color:#666;
    margin-bottom:35px;

}

.btn{

    display:block;
    width:100%;
    padding:14px;
    margin:15px 0;
    border:none;
    border-radius:8px;
    font-size:18px;
    text-decoration:none;
    color:white;
    transition:.3s;

}

.register{

    background:#28A745;

}

.register:hover{

    background:#218838;

}

.login{

    background:#007BFF;

}

.login:hover{

    background:#0056b3;

}

</style>

</head>

<body>

<div class="card">

    <h1>Employee Portal</h1>

    <p>Welcome to Employee Management System</p>

    <a href="Register.jsp" class="btn register">
        Register
    </a>

    <a href="Login.jsp" class="btn login">
        Login
    </a>

</div>

</body>
</html>