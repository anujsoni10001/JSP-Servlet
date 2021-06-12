<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String id=request.getParameter("id");
String Name=request.getParameter("Name");
String Price=request.getParameter("Price");
String Category=request.getParameter("Category");
String Company=request.getParameter("Company");
String qru="update Product set Name=?,Price=?,Category=?,Company=? where id=?";
PreparedStatement ps=con.prepareStatement(qru);
ps.setString(1,Name);
ps.setString(2,Price);
ps.setString(3,Category);
ps.setString(4,Company);
ps.setString(5,id);
int i=ps.executeUpdate();
//Page A Difference b/w include and forward 
if(i!=0)
{
rd=request.getRequestDispatcher("Show.jsp");
rd.include(request,response);
%>
<%="Updation Succesful.."%>
<%
}
else
{
out.println("Updation By ID Not Succesful");
}
ps.close();
%>