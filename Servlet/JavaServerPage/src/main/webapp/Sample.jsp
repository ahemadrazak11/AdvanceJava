<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Declaration Tag -->

<%!
	int a = 10;

	public int m1(){
		return 10+30;
	}
%>


<!-- Expression Tag -->

<h2>The integer a = <%= a %></h2>

<h2>The m1 returns = <%= m1()%></h2>



<!-- scriptlet Tag -->

<%
	int b = 20;

	ArrayList<String> str = new ArrayList<String>();
	
	str.add("Java");
	
	str.add("Web");
	
	str.add("SQL");

%>


<!-- Web Page from ArrayList -->


<%
for(String s : str)
{
%>

<h2>The String Value = <%=s %></h2>

<%
}
%>


</body>
</html>