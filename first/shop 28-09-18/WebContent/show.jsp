<%@page import="mvc.Product"%>
<%@page import="mvc.RegisterDao"%>
<table align="center" border="1">



<%
RegisterDao rd=new RegisterDao();
java.util.ArrayList<Product> al= rd.showRecords();
for(Product p:al)
{
	String name=p.getName();
	String price=p.getPrice();
	String cat=p.getCat();
	String cmp=p.getCmp();
	%>
	  <tr>
    <td><%=name %></td>
    <td><%=price %></td>
  <td><%=cat %></td>
  <td><%=cmp %></td>
  </tr>
	<%
}
%>
</table>