<%@page import="java.sql.*"%>
<%
String Name=request.getParameter("Name");
String Price=request.getParameter("Price");
String Category=request.getParameter("Category");
String Company=request.getParameter("Company");
String id=request.getParameter("id");
String email=request.getParameter("email");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
    String qr="insert into cart values(?,?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(qr);
	ps.setString(1,Name);
	ps.setString(2,Price);
	ps.setString(3,Category);
	ps.setString(4,Company);
	ps.setString(5,id);
	ps.setString(6,email);
	int i=ps.executeUpdate();
if(i!=0)
{
RequestDispatcher rd=request.getRequestDispatcher("Uhome.jsp");
rd.include(request,response);
out.println("Added to Cart Successful..");
}
else
{
RequestDispatcher rd=request.getRequestDispatcher("Uhome.jsp");
rd.include(request,response);
out.println("Added to Cart Not Successful..");
}
%>