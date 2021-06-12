<%@page import="java.sql.*"%>
<table align="center" border="1">
  <%
  String email=request.getParameter("email");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
String qr="select * from cart where email=?";
PreparedStatement st=con.prepareStatement(qr);
st.setString(1,email);
ResultSet rs=st.executeQuery();
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