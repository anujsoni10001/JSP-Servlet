<%@page import="pp.apoint"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pp.RegisteredDao"%>
<%@page errorPage="error.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Status Page</title>
</head>
<body>
<table align="center" border="1">
<tr><th>Status of Booking</th><th>Date</th><th>Time</th></tr>
<%
String id=request.getParameter("id");
RequestDispatcher rd1=request.getRequestDispatcher("show.jsp");
rd1.include(request,response);
RegisteredDao rd=new RegisteredDao();
java.util.ArrayList<apoint> a1=rd.Showapoint(id);
for(apoint p:a1)
{
%>
<tr><td><%=p.getStatus()%></td><td><%=p.getDate()%></td><td><%=p.getTime()%></td></tr>
<%
}
%>
</table>
</body>
</html>