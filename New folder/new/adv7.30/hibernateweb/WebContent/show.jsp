<%@page import="org.hibernate.cfg.*" %>
<%@page import="org.hibernate.*" %>
<%@page import="java.util.List" %>
<%@page import="pp.Emp" %>
<table align="center" border="1">
<%
Session se=new Configuration().configure().buildSessionFactory().openSession();
Query qr=se.createQuery("from Emp");
List<Emp> al=qr.list();
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
se.close();
%>
</table>