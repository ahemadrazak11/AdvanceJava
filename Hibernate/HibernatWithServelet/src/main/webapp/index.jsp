<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>

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
    background:linear-gradient(135deg,#4F46E5,#9333EA);
}

.container{
    width:420px;
    background:#fff;
    border-radius:18px;
    padding:40px;
    box-shadow:0 15px 35px rgba(0,0,0,0.25);
    text-align:center;
}

.container h1{
    color:#333;
    margin-bottom:10px;
}

.container p{
    color:#666;
    margin-bottom:35px;
    font-size:15px;
}

.button-group{
    display:flex;
    flex-direction:column;
    gap:20px;
}

button{
    width:100%;
    padding:15px;
    border:none;
    border-radius:10px;
    font-size:18px;
    font-weight:bold;
    cursor:pointer;
    transition:.3s;
}

.student-btn{
    background:#2563EB;
    color:#fff;
}

.student-btn:hover{
    background:#1D4ED8;
    transform:translateY(-3px);
}

.book-btn{
    background:#10B981;
    color:#fff;
}

.book-btn:hover{
    background:#059669;
    transform:translateY(-3px);
}

.footer{
    margin-top:30px;
    color:#888;
    font-size:14px;
}

</style>

</head>
<body>

<div class="container">

    <h1>Welcome</h1>

    <p>Select an option to continue</p>

    <div class="button-group">

        <form action="AddStudent.jsp" method="get">
            <button class="student-btn">
                Add Student
            </button>
        </form>

        <form action="AddBook.jsp" method="get">
            <button class="book-btn">
                Add Book
            </button>
        </form>

    </div>

    <div class="footer">
        Library Management System.
    </div>

</div>
</body>
</html>