<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String id=request.getParameter("id");
String qr="select date,time,status from apoint where id=?";           
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,id);
ResultSet rs=ps.executeQuery();
rd=request.getRequestDispatcher("showser.jsp");
rd.include(request,response);
if(rs.next())
{
%>
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
String status=rs.getString("status");
String date=rs.getString("date");
String time=rs.getString("time");
do
{
%>
<tr><td><%=status%></td><td><%=date%></td><td><%=time%></td></tr>
<%
}while(rs.next());
%>
</table>
</body>
</html>
<%
}
else
{
%>
<%="No Record of Appointment Found might be deleted by the Service Provider"%>
<%
}
%>