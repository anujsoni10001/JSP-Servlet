<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String id=request.getParameter("id");
String qr="delete from Product where id=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,id);
int i=ps.executeUpdate();
if(i!=0)
{
rd=request.getRequestDispatcher("Show.jsp");
rd.include(request,response);
%>
<%=i+" Deletion Succesful..."%>
<%
}
else
{
rd=request.getRequestDispatcher("Show.jsp");
rd.include(request,response);
%>
<%=i+"Deletion Succesful..."%>
<%
}
%>