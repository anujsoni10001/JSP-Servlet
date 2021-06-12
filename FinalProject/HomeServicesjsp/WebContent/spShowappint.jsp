<%@include file="db.jsp"%>
<%@page errorPage="error.jsp"%>
<%
String sid=(String)session.getAttribute("sid");
String qr="select * from apoint where sid=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,sid);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appointment Show Page</title>
<link rel="stylesheet" type="text/css" href="b.css">
</head>
<body>
<h3>Welcome to Appointment Show Page</h3>
<table align="center" border="1">
<tr><th>ID</th><th>Email</th><th>Date</th><th>Time</th></tr>
<%
do
{
	String id=rs.getString("id");
	String email=rs.getString("email");
	String date=rs.getString("date");
	String time=rs.getString("time");
	out.println("<tr>");
	out.println("<td>");
    out.println(id);
    out.println("</td>");
	out.println("<td>");
    out.println(email);
    out.println("</td>");
    out.println("<td>");
    out.println(date);
    out.println("</td>");
    out.println("<td>");
    out.println(time);
    out.println("</td>");
    out.println("<td>");
    out.println("<a href=conform.jsp?sid="+sid+"&id="+id+"><button>CONFORM</button></a>");
    out.println("</td>");
    out.println("<td>");
    out.println("<a href=Cancel.jsp?sid="+sid+"&id="+id+"><button>CANCEL</button></a>");
    out.println("</td>");
    out.println("<td>");
    out.println("<a href=Deleteap.jsp?sid="+sid+"&id="+id+"><button>DELETE</button></a>");
    out.println("</td>");
    out.println("</tr>");
}while(rs.next());
%>
</table>
</body>
</html>
<%
}
else
{
out.println("No Data Found...");
}
%>