<%@page import="java.sql.*"%>
<%
String email=(String)session.getAttribute("id");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
String qr="select * from cart where email=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,email);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Page</title>
</head>
<body>
<h3 align="center">Welcome to Cart Page</h3>
<table align="center" border="1">
<tr><th>Name</th><th>Price</th><th>Category</th><th>Company</th><th>id</th></tr>
			<%
			do
			{
			String Name=rs.getString("Name");
			String Price=rs.getString("Price");
			String Category=rs.getString("Category");
			String Company=rs.getString("Company");
			String id=rs.getString("id");
			%>
			<tr>
			<td>
		    <%=Name%>
		    </td>
			<td>
		    <%=Price%>
		    </td>
            <td>
		    <%=Category%>
		    </td>
            <td>
		    <%=Company%>
		    </td>           
            <td>
		    <%=id%>
		    </td>
		    <td>
            <a href=ClearCart.jsp?id=<%=id%>>Clear</a>
		    </td>
		    </tr>
	        <%
	        }while(rs.next());
			%>
			</table>
	        <%
			}
			else
			{
			%>
			<%="No Data Found"%>	
			<%
			}
%>