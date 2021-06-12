<%@include file="db.jsp" %>
<%
String qr="select * from product";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(qr);
%>
<table border=1px align=center>
<tr>
<td>
<%="ID"%>
</td>
<td>
<%="NAME" %>
</td>
<td>
<%="CAT" %>
</td>
<td>
<%="CMP"%>
</td>
</tr>
<%
while(rs.next())
{
String id=rs.getString("id");
String name=rs.getString("name");
String cat=rs.getString("cat");
String cmp=rs.getString("cmp");

%>
<tr>
<td>
<%=id %>
</td>
<td>
<%=name %>
</td>
<td>
<%=cat %>
</td>
<td>
<%=cmp %>
</td>
</tr>
<%
}
%>
</table>
<%
%>
