<%--Concept of 5 JSP Action Elements--%>
<%--<jsp:include page="#">--%>
<%--Java-include action element--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="Login.jsp">
ID<input type="text" name="id">
Password<input type="text" name="pwd">
<input type="submit" value="login">
<jsp:include page="Calc.jsp"></jsp:include>
</form>
</body>
</html>