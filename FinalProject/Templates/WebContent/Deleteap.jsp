<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String sid=request.getParameter("sid");
String id=request.getParameter("id");
String qr="delete from apoint where id=? and sid=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,id);
ps.setString(2,sid);
int i=ps.executeUpdate();
if(i!=0)
{
rd=request.getRequestDispatcher("table.jsp");
rd.include(request,response);
%>
<%="Succesful..."%>
<%
}
else
{
	rd=request.getRequestDispatcher("table.jsp");
	rd.include(request,response);
%>
<%="Not Succesful..."%>
<%
}	
%>