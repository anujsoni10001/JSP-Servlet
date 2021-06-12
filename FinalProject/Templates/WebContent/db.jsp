<%@page import="java.sql.*"%>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
RequestDispatcher rd;
%>

