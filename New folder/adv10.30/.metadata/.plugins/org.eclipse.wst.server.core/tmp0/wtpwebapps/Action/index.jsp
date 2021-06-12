<%@page import="pp.Bean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="a" class="pp.Bean">
<jsp:setProperty property="id" value="101" name="a"></jsp:setProperty>
<jsp:setProperty property="name" value="programmer" name="a"></jsp:setProperty>
<jsp:getProperty property="id" name="a"></jsp:getProperty>
<jsp:getProperty property="name"  name="a"></jsp:getProperty>
</jsp:useBean>

</body>
</html>