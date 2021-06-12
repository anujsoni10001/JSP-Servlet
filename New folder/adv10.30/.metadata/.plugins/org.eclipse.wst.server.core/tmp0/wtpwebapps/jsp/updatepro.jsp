<%@page import="java.sql.*" %>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String cat=request.getParameter("cat");
String cmp=request.getParameter("cmp");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","root");
String qr="update product set name=?,cat=?,cmp=? where id=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, name);
ps.setString(2, cat);
ps.setString(3, cmp);
ps.setString(4, id);
int i=ps.executeUpdate();
if(i>0)
{
RequestDispatcher rd=request.getRequestDispatcher("new.jsp");
rd.include(request, response);
%>
<%="Data Updated" %>
<%
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("new.jsp");
	rd.include(request, response);
	%>
	<%="Data not Updated" %>
	<%
	
	
}
%>