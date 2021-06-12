<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String qrs="select * from Product";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(qrs);
if(rs.next())
{
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		    pageEncoding="ISO-8859-1"%>
		<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Show Page</title>
		</head>
		<body>
		<table align="center" border="1">
		<tr><th>Name</th><th>Price</th><th>Category</th><th>Company</th><th>id</th></tr>
<% 
do
{
	//Page B Difference b/w include and forward 
String Name=rs.getString("Name");
String Price=rs.getString("Price");
String Category=rs.getString("Category");
String Company=rs.getString("Company");
String id=rs.getString("id");
%>
<tr>
<td><%=Name%></td>
<td><%=Price%></td>
<td><%=Category%></td>
<td><%=Company%></td>
<td><%=id%></td>
<!--Concept of URL REWRITING....-->
<td><a href="Deleteinshow.jsp?id=<%=id%>">Delete</a></td>
<!--Concept of HFF (Hidden Form Field) REWRITING....-->
<td><a href="Update.jsp?id=<%=id%>&Name=<%=Name%>&Price=<%=Price%>&Category=<%=Category%>&Company=<%=Company%>">Update</a></td>
</tr>
<%
}while(rs.next());
%>
</table>
</body>
</html>
<%
rs.close();
con.close();
}
else
{
%>
<%="No Data Found"%>
<%
}
%>

