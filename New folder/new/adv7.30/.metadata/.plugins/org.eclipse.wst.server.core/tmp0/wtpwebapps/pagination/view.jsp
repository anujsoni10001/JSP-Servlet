<%@page import="pp.RegisterDao"%>
<%@page import="pp.Product"%>
<%@page import="java.util.ArrayList"%>
<table align="center" border="1">
<%
String id=request.getParameter("pid");
int pid=Integer.parseInt(id);
int total=5;
if(pid==1)
{
	pid=pid-1;
}
else
{
	pid=pid-1;
	pid=pid*total;
}
RegisterDao rd=new RegisterDao();
ArrayList<Product> al=rd.showrecords(pid, total);
for(Product p:al)
{
%>
<tr>
<td><%=p.getName() %></td>
<td><%=p.getPrice() %></td>
</tr>

<%
	
}
%>
</table>
<%
int t=rd.countRows();
int c=0;
for(int i=1;i<=t;i=i+5)
{
	c++;

%>
<a href="view.jsp?pid=<%=c %>"><%=c %></a>
<%
}
%>