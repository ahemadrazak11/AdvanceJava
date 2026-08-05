<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial,sans-serif;
}

body{
    background:#f4f7fb;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.container{
    width:420px;
    background:#fff;
    padding:35px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,.2);
}

h2{
    text-align:center;
    margin-bottom:25px;
    color:#333;
}

.input-box{
    margin-bottom:18px;
}

label{
    display:block;
    margin-bottom:8px;
    font-weight:bold;
}

input{
    width:100%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:8px;
    font-size:16px;
}

button{
    width:100%;
    padding:13px;
    background:#2563EB;
    color:white;
    border:none;
    border-radius:8px;
    cursor:pointer;
    font-size:17px;
    font-weight:bold;
}

button:hover{
    background:#1D4ED8;
}

</style>

</head>

<body>

<div class="container">

<h2>Add Student</h2>

<form action="save-student" method="post">

<div class="input-box">
<label>Student ID</label>
<input type="number" name="id" required>
</div>

<div class="input-box">
<label>Student Name</label>
<input type="text" name="name" required>
</div>

<div class="input-box">
<label>Mobile Number</label>
<input type="number" name="mobile" required>
</div>

<div class="input-box">
<label>Email</label>
<input type="email" name="email" required>
</div>

<button type="submit">Save Student</button>

</form>

</div>

</body>
</html>