<%@page import="java.sql.*"%>
<%
String email=(String)session.getAttribute("id");
%>
<%="Welcome to User Home"+email%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home</title>
</head>
<body>
<a href="ULogout.jsp">LogOut</a>
<a href="ShowCart.jsp?email=<%=email%>">ShowCart</a>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
Statement st=con.createStatement();
String qr="select * from Product";
ResultSet rs=st.executeQuery(qr);
if(rs.next())
{
do
{
String name=rs.getString("Name");
String price=rs.getString("Price");
String cat=rs.getString("Category");
String cmp=rs.getString("Company");
String id=rs.getString("id");
%>
<div style="background-color:pink;color:black;height:100px;width:80%">
<pre>
<%=name%>
<%=price%>
<%=cat%>
<%=cmp%>
<%=id%>
<a href="https://www.paypal.com/login">Buy Now</a><a href="AddProCart.jsp?email=<%=email%>&Name=<%=name%>&Price=<%=price%>&Category=<%=cat%>&Company=<%=cmp%>&id=<%=id%>">Add to Cart</a>
</pre>
</div>
<%
}while(rs.next());
}
else
{
%>
<%="No Product Found...."%>
<% 
}
%>
</body>
</html>