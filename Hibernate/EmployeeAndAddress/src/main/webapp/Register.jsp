<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:#f2f5f9;
}

.container{
    width:700px;
    margin:30px auto;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 0 10px rgba(0,0,0,.2);
}

h1{
    text-align:center;
    margin-bottom:25px;
}

h2{
    margin-top:25px;
    margin-bottom:15px;
    color:#444;
}

.input-group{
    margin-bottom:15px;
}

label{
    display:block;
    font-weight:bold;
    margin-bottom:5px;
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
    margin-top:20px;
    background:#0d6efd;
    color:white;
    border:none;
    border-radius:5px;
    cursor:pointer;
    font-size:16px;
}

button:hover{
    background:#0b5ed7;
}

</style>

</head>

<body>

<div class="container">

<h1>Employee Registration</h1>

<form action="register">

<h2>Employee Details</h2>

<div class="input-group">
<label>Name</label>
<input type="text" name="name" required>
</div>

<div class="input-group">
<label>Age</label>
<input type="number" name="age" required>
</div>

<div class="input-group">
<label>Salary</label>
<input type="number" step="0.01" name="salary" required>
</div>

<div class="input-group">
<label>Email</label>
<input type="email" name="email" required>
</div>

<div class="input-group">
<label>Password</label>
<input type="password" name="password" required>
</div>

<h2>Address Details</h2>

<div class="input-group">
<label>House Number</label>
<input type="text" name="houseNumber" required>
</div>

<div class="input-group">
<label>Street</label>
<input type="text" name="street" required>
</div>

<div class="input-group">
<label>Pincode</label>
<input type="number" name="pincode" required>
</div>

<div class="input-group">
<label>State</label>
<input type="text" name="state" required>
</div>

<div class="input-group">
<label>Country</label>
<input type="text" name="country" required>
</div>

<button type="submit">
Register Employee
</button>

</form>

</div>

</body>
</html>