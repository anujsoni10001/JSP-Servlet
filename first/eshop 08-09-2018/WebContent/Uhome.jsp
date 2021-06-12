		<%@page import="java.sql.*"%>
<%
String email=(String)session.getAttribute("id");
		out.println("welcome "+email);
		 %>
		 <a href="img.html">Upload Image</a>
		<a href=Logout>Logout</a>
		<a href="ShowCart.jsp?email=<%=email%>">Show Cart</a>

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
		<div style="background-color: pink;color: black;height: 100px;width: 80%">
		         <pre>
		         <%=name %>
		         <%=price %>
		         <%=cat %>
		         <%=cmp %>
		         <a href="https://www.paypal.com/in/signin">Buy Now</a>  <a href="Cart?name=<%=name%>&price=<%=price%>&cat=<%=cat%>&cmp=<%=cmp%>">ADD TO CART</a>
		         </pre>
		</div>
		<%
	}while(rs.next());
}
else
{
	out.println("no data found");
}
%>
