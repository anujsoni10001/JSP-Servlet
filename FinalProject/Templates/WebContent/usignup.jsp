<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String pwd=request.getParameter("pwd");
String qr="insert into user(email,pwd,name) values(?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,email);
ps.setString(2,pwd);
ps.setString(3,name);
int i=ps.executeUpdate();
if(i!=0)
{
rd=request.getRequestDispatcher("index.jsp");
rd.include(request,response);
%>
<%="User Registration Succesful..."%>
<%
}
else
{
	rd=request.getRequestDispatcher("spsignup.jsp");
	rd.include(request,response);
%>
<%="User Registration Not Succesful..."%>
<%
}	
%>