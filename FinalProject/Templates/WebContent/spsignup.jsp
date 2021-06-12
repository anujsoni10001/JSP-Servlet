<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String sid=request.getParameter("sid");
String name=request.getParameter("name");
String email=request.getParameter("email");
String pwd=request.getParameter("pwd");
String qr="insert into ServiceProvider values(?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,sid);
ps.setString(2,name);
ps.setString(3,email);
ps.setString(4,pwd);
int i=ps.executeUpdate();
if(i!=0)
{
rd=request.getRequestDispatcher("index.jsp");
rd.include(request,response);
%>
<%="Registration Succesful..."%>
<%
}
else
{
	rd=request.getRequestDispatcher("spsignup.jsp");
	rd.include(request,response);
%>
<%="Registration Not Succesful..."%>
<%
}	
%>