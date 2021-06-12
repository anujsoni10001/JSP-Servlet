<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String id=request.getParameter("id");
String Name=request.getParameter("Name");
String Price=request.getParameter("Price");
String Category=request.getParameter("Category");
String Company=request.getParameter("Company");
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<body>
<form action="updatejdbc.jsp" method="post">
<%="Product Name :"+Name%>
<pre>
<!--Concept of HFF (Hidden Form Field) REWRITING....-->
<!--Concept of URL REWRITING....-->
Enter the Name:<input type=text name="Name" value=<%=Name%>>
Enter the Price: <input type="text" name="Price" value=<%=Price%>>
Enter the Category: <input type="text" name="Category" value=<%=Category%>> 
Enter the Company: <input type="text" name="Company" value=<%=Company%>>
<input type="hidden" name="id" value=<%=id%>>
<input type="submit" value="UPDATE">
</pre>
</form>
</body>
</html>
<%
//Page A Difference b/w include and forward 
rd=request.getRequestDispatcher("Show.jsp");
rd.include(request,response);
%>