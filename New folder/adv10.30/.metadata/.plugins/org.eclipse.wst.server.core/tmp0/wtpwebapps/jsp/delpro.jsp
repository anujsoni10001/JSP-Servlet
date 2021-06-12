<%@include file="db.jsp" %>
<%@page errorPage="error.jsp"%>
<%
String id=request.getParameter("id");


String qr="delete from product where id=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,id);
int i=ps.executeUpdate();
if(i>0)
{
RequestDispatcher rd=request.getRequestDispatcher("new.jsp");
rd.include(request, response);
out.println("Data Deleted");
}
else
{
	response.sendRedirect("error.jsp");	
}

%>