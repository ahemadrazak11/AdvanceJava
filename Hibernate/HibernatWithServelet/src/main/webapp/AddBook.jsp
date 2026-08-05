<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial;
}

body{
    background:#f5f5f5;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.container{
    width:400px;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 5px 15px rgba(0,0,0,.2);
}

h2{
    text-align:center;
    margin-bottom:20px;
}

input{
    width:100%;
    padding:10px;
    margin:10px 0;
}

button{
    width:100%;
    padding:12px;
    background:#2563EB;
    color:white;
    border:none;
    cursor:pointer;
}

button:hover{
    background:#1D4ED8;
}

</style>

</head>

<body>

<div class="container">

<h2>Add Book</h2>

<form action="save-book" method="post">

<input type="number" name="id" placeholder="Book ID" required>

<input type="text" name="name" placeholder="Book Name" required>

<input type="text" name="auth" placeholder="Author Name" required>

<input type="number" step="0.01" name="price" placeholder="Price" required>

<input type="number" name="quantity" placeholder="Quantity" required>

<button type="submit">Save Book</button>

</form>

</div>

</body>
</html>