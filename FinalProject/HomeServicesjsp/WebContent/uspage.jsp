<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String pwd=request.getParameter("pwd");
String qr="insert into user values(?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,email);
ps.setString(2,pwd);
ps.setString(3,name);
int i=ps.executeUpdate();
if(i!=0)
{
rd=request.getRequestDispatcher("User.jsp");
rd.include(request,response);
%>
<%="Register Succesful..."%>
<%
}
else
{
	rd=request.getRequestDispatcher("User.jsp");
	rd.include(request,response);
%>
<%="Register Not Succesful..."%>
<%
}	
%>