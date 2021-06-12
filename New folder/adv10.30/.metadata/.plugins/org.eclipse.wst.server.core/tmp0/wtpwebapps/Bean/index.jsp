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
<jsp:useBean id="ab" class="pp.Bean">
<jsp:setProperty property="id" value="101" name="ab"></jsp:setProperty>
<jsp:setProperty property="name" value="Vikas" name="ab"></jsp:setProperty>
<jsp:getProperty property="id" name="ab"></jsp:getProperty>
<jsp:getProperty property="name" name="ab"></jsp:getProperty>
</jsp:useBean>

</body>
</html>