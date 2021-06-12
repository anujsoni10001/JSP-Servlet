<%@page import="pp.RegisterDao"%>
<%@page import="pp.Emp"%>
<%@page import="java.util.*"%>
<table>
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
int j=rd.count();
ArrayList<Emp> al=rd.show(pid, total);
for(Emp e:al)
{
	%>
	<tr>
	<td><%=e.getId() %></td>
	<td><%=e.getName() %></td>
	</tr>
	<%
}
%>
</table>
<%
int k=0;
for(int i=0;i<=j;i=i+5)
{
	k++;
	%>
<a href="view.jsp?pid=<%=k %> "><%=k %></a>	
	<%
}
%>

