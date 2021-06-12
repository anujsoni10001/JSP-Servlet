<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String email=request.getParameter("id");
String pwd=request.getParameter("pwd");
String qr="select * from user where email=? and pwd=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,email);
ps.setString(2,pwd);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
session.setAttribute("id",email);
rd=request.getRequestDispatcher("userhome.jsp");
rd.include(request,response);
out.println("Login Succesful...");
rs.close();
con.close();
}
else
{
rd=request.getRequestDispatcher("Ulogin.jsp");
rd.include(request,response);
out.println("Login Not Succesful...Try Again");
rs.close();
con.close();
}
%>
