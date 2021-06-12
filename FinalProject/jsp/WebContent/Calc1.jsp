<%@page import="java.util.Date"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<%--Use of the JSP Page Directive
<%@page import="java.util.Date"%>--%>
<%
Date d1=new Date();
out.println(d1);
%>
<h1>this is my first jsp page</h1>
<form action="Calc.jsp" method="post">
num1<input type="text" name="n1">
num2<input type="text" name="n2">
<input type="submit" name="b" value="ADD">
<input type="submit" name="b" value="SUB">
<input type="submit" name="b" value="MUL">
<input type="submit" name="b" value="DIV">
</form>
</body>
</html>