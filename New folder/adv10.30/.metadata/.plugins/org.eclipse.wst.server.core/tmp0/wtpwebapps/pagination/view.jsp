<%@page import="pp.*" %>
<%@page import="java.util.*" %>
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
ArrayList<Emp> al=rd.showRecord(pid, total);
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
int c=1;
int s=rd.getSize();
for(int i=1;i<=s;i=i+5)
{
%>
<a href="view.jsp?pid=<%=c %>"><%=c %></a>

<%
c++;
}
%>





