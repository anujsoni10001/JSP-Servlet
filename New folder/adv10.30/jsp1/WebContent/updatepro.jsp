<%@include file="db.jsp" %>
<%@page errorPage="error.jsp" %>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String cat=request.getParameter("cat");
String cmp=request.getParameter("cmp");

String qr="update product set name=?,cat=?,cmp=? where id=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, name);
ps.setString(2, cat);
ps.setString(3, cmp);
ps.setString(4, id);
int i=ps.executeUpdate();
if(i>0)
{
RequestDispatcher rd=request.getRequestDispatcher("adminhome.jsp");
rd.include(request, response);
%>
<br>
<%="Data Updated" %>
<%
}
else
{
	response.sendRedirect("error.jsp");	
}
%>