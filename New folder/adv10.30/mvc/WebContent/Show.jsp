<%@page import="pp.RegisterDao"%>
<%@page import="pp.Product"%>
<%@page import="java.util.ArrayList"%>
<table align="center" border="1">
  


<%
RegisterDao rd=new RegisterDao();
ArrayList<Product> al=rd.show();
if(al.isEmpty())
{
	out.println("no records found");
}
else
{
	for(Product p:al)
	{
		%>
		<tr>
    <td><%=p.getName() %></td>
    <td><%=p.getPrice() %></td>
    <td><%=p.getCat() %></td>
    <td><%=p.getCmp() %></td>
    <td><a href="Delete.jsp?name=<%=p.getName() %>">Delete</a></td>
  </tr>
		<%
	}
}
%>
</table>