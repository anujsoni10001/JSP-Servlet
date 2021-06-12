<%@page import="pp.*"%>
<%@page import="java.util.List"%>
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
List<Emp> al=rd.showRecords(pid, total);
for(Emp e:al)
{
	%>
	<tr>
	<td><%=e.getId() %></td>
	<td><%=e.getName() %></td>
	<td><%=e.getJob() %></td>
	</tr>
	<%
}
%>
</table>
<%
int n=rd.countRecords();
int c=0;
for(int i=1;i<=n;i=i+5)
{
	c++;
%>
<a href="view.jsp?pid=<%=c %>"><%=c %></a>
<%} %>
