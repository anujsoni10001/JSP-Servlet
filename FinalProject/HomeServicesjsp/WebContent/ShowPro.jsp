<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
            Statement st=con.createStatement();
			String qr="select * from addser";
			ResultSet rs=st.executeQuery(qr);
			if(rs.next())
			{
			%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Page</title>
<link rel="stylesheet" type="text/css" href="b.css">
</head>
<body>
<h3>Welcome to Show Page</h3>
<table align="center" border="1">
<tr><th>Service-Provide-ID</th><th>ID of Service</th><th>Type of Service</th><th>Location</th><th>Mobile Number</th><th colspan="2" align="right">Available Timings(Time t to t1)</th><th>Working Days</th></tr>
			<%
			do
			{
			String id=rs.getString("id");
			String tyservice=rs.getString("tyservice");
			String Location=rs.getString("Location");
			String mnumber=rs.getString("mnumber");
			String sid=rs.getString("sid");
			String t=rs.getString("t");
			String t1=rs.getString("t1");
			String a=rs.getString("a");
			out.println("<tr>");
			out.println("<td>");
		    out.println(sid);
		    out.println("</td>");
			out.println("<td>");
		    out.println(id);
		    out.println("</td>");
            out.println("<td>");
            out.println(tyservice);
		    out.println("</td>");
            out.println("<td>");
            out.println(Location);
		    out.println("</td>");
            out.println("<td>");
            out.println(mnumber);
		    out.println("</td>");
            out.println("<td>");
            out.println(t);
		    out.println("</td>");
		    out.println("<td>");
            out.println(t1);
		    out.println("</td>");
		    out.println("<td>");
            out.println(a);
		    out.println("</td>");
		    out.println("<td>");
            out.println("<a href=b.jsp?id="+id+"&sid="+sid+"><button>BOOK</button></a>");
		    out.println("</td>");
		    out.println("<td>");
		    out.println("<a href=gets.jsp?id="+id+"><button>GET-STATUS</button></a>");
		    out.println("</td>");
		    out.println("</tr>");
	        }while(rs.next());
			%>
			</table>
			<form>
			<input type="text">
			</form>
			<%
			}
			else
			{
			%>
			<%="No Data Found"%>	
			<%
			}
%>