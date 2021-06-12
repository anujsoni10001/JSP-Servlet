<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("img");
out.println(name);
String id=(String)session.getAttribute("id");

	
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
	String qr="update user set img=? where email=? ";
	PreparedStatement ps=con.prepareStatement(qr);
	
	ps.setString(1, name);
	ps.setString(2, id);
	
int i=ps.executeUpdate();
	if(i>0)
	{
		out.println(" record updated");
	}
	else
	{
		out.println(" record not updated");
	}
	%>
	<img alt="" src="<%=name %>"/>
	<% 
	
	con.close();
} catch (Exception e) {
	// TODO Auto-generated catch block
	out.println(e);
}
%>

</body>
</html>