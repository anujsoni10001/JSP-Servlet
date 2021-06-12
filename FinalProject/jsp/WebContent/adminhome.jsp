<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminHome Page</title>
</head>
<body>
<h1>Welcome to Admin Home</h1>
<%--////Here we use session implict object provided by JSP
//JSP(Java Server Page)--%>
<%
String id=(String)session.getAttribute("id");
%>
<%="Welcome@"+id%>
<pre>
<a href="addPro.jsp">Add</a>
<a href="Delete.jsp">Delete</a>
<a href="UpPro.jsp">Update</a>
<a href="Show.jsp">Show</a>
</pre>
<a href="Logout.jsp">Logout</a>
</body>
</html>