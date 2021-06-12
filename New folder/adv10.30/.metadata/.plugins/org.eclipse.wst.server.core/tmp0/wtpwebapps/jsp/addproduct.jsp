<%@include file="db.jsp" %>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String cat=request.getParameter("cat");
String cmp=request.getParameter("cmp");


String qr="insert into product values(?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,id);
ps.setString(2,name);
ps.setString(3,cat);
ps.setString(4,cmp);
int i=ps.executeUpdate();
if(i>0)
{
RequestDispatcher rd=request.getRequestDispatcher("new.jsp");
rd.include(request, response);
out.println("Data Inserted");
}
else
{
	RequestDispatcher rd1=request.getRequestDispatcher("new.jsp");
	rd1.include(request, response);
	out.println("Data Not Inserted");	
}

%>