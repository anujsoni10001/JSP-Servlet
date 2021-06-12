<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String semail=request.getParameter("semail");
String pwd=request.getParameter("pass");
String qr="select * from ServiceProvider where semail=? and pwd=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,semail);
ps.setString(2,pwd);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
session.setAttribute("sid",semail);
rd=request.getRequestDispatcher("index.jsp");
rd.include(request,response);
out.println("Login Succesful...");
rs.close();
ps.close();
con.close();
}
else
{
rd=request.getRequestDispatcher("index.html");
rd.include(request,response);
out.println("Login Not Succesful...Try Again");
rs.close();
con.close();
}
%>
