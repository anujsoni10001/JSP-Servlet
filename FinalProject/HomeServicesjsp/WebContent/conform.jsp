<%@include file="db.jsp"%>
<%@page errorPage="error.jsp"%>
<%
String id=request.getParameter("id");
String sid=request.getParameter("sid");
int i=0;
String qr="update apoint set status=? where id=? and sid=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,"BOOKED");
ps.setString(2,id);
ps.setString(3,sid);
i=ps.executeUpdate();
if(i!=0)
{
response.sendRedirect("spShowappint.jsp");
}
ps.close();
%>