<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Declaration Tag act as a class block-->
<%! 

int num = 500;

%>

<!-- Expression Tag -->

<h1>This is a JSP File.</h1>
<h2>Number from 0 to <%=num %></h2>
<br>



<!-- This is Scriptlet Tag -->

<p>
<% 

for(int i = 0; i<=num; i++)
{
%>
		<%= i %> <br>
<%
} 
%>	



</p>


</body>
</html>