<%@page import="pp.RegisteredDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register-Staff</title>
</head>
<body>
<pre>
<form action="RegisterStaff">
Hospital Name:<select name="hname">
<%
RegisteredDao rd=new RegisteredDao();
java.util.ArrayList<pp.Hospital> h=rd.ShowHospital();
for(pp.Hospital a:h)
{
%>
<option><%=a.getHospitalName()%></option>
<%
}	
%>
</select>
Position:<select name="pos">
<option>Nurse</option>
<option>Management</option>
<option>Medical</option>
</select>
First Name:<input type="text" name="fname">
Last Name:<input type="text" name="lname">
NRIC:<input type="text" name="nric">
Phone No.:<input type="text" name="phone">
Address:<input type="text" name="address">
Email:<input type="email" name="email">
Password:<input type="password" name="pwd">
<input type="submit" value="Register">
</form>
</pre>
</body>
</html>