<%@page import="pp.*" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="rd" class="pp.RegisterDao"></jsp:useBean>
<table align="center" border="1px" >
<%
ArrayList<Product> al=rd.showRecord();
for(Product p:al)
{
	%>
	<tr>
	<td><%=p.getName() %></td>
	<td><%=p.getPrice() %></td>
	<td><%=p.getCat() %></td>
	<td><%=p.getCmp() %></td>
	<td><a href="Delete.jsp?name=<%=p.getName() %>">Delete</a></td>
	
	</tr>
	<%
}
%>
</table>
</body>
</html>