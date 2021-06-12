<%@page import="pp.ProductBean"%>
<%@page import="pp.RegisteredDao"%>
<table border=1>
<%
RegisteredDao rd=new RegisteredDao();
java.util.ArrayList<ProductBean> a1=rd.ShowPro();
for(ProductBean p:a1)
{
%>
<tr>
<td><%=p.getName()%></td>
<td><%=p.getId()%></td>
<td><%=p.getCat()%></td>
<td><%=p.getCmp()%></td>
<td><%=p.getPrice()%></td>
<td><a href="delPro.jsp?id=<%=p.getId()%>">Delete</a></td>
<td><a href="update.jsp?id=<%=p.getId()%>">Update</a></td>
</tr>
<%
}
%>
</table>