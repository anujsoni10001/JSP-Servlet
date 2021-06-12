<%@page import="java.sql.*"%>
<table align="center" border="1">
  <%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
String qr="select * from product";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(qr);
if(rs.next())
{
	do
	{
		String name=rs.getString("name");
		String price=rs.getString("price");
		String cat=rs.getString("cat");
		String cmp=rs.getString("cmp");
		%>
		<tr>
		<td><%=name %></td>
		<td><%=price %></td>
		<td><%=cat %></td>
		<td><%=cmp %></td>
		<td><a href="Delete.jsp?name=<%=name%>">Delete</a></td>
		</tr>
		<%
	}while(rs.next());
}
else
{
	out.println("no data found");
}
%>
</table>