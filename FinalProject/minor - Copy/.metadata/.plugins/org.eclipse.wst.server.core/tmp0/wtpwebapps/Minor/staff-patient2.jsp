<%@page import="pp.PatientAccountBean"%>
<%@page import="pp.RegisteredDao"%>
<%
String a_id=request.getParameter("a_id");
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String email=request.getParameter("email");
String telephone=request.getParameter("telephone");
String address=request.getParameter("address");
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My-Accounts</title>
</head>
<body>
<h3>My Accounts</h3>
<pre>
<form action="UpdateStaffPatient">
<input type="hidden" value=<%=a_id%> name="a_id">
First Name : <input type="text" placeholder=<%=fname%> name="fname">
Last Name : <input type="text" placeholder=<%=lname%> name="lname">
Telephone : <input type="text" placeholder=<%=telephone%> name="telephone">
Address : <input type="text" placeholder=<%=address%> name="address">
Email : <input type="email" placeholder=<%=email%> name="email">
<input type="submit" value="Update"/>  
</form>
</pre>
</body>
</html>