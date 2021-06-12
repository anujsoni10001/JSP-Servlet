<%@page errorPage="error.jsp"%>
<%@page import="java.sql.*"%>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
String sid=request.getParameter("sid");
String pwd=request.getParameter("pwd");
String qr="select * from ServiceProvider where sid=? and pwd=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,sid);
ps.setString(2,pwd);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
session.setAttribute("sid",sid);
RequestDispatcher rd=request.getRequestDispatcher("SPhome.jsp");
rd.include(request,response);
out.println("Login Succesful...");
rs.close();
con.close();
}
else
{
RequestDispatcher rd=request.getRequestDispatcher("SPlogin.jsp");
rd.include(request,response);
out.println("Login Not Succesful...Try Again");
rs.close();
con.close();
}
%>
