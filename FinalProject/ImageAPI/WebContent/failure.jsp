<!--///Get FileName from the Database...
////Database Name :- test
///Database Relation Name :- test-->

<%@page import="java.sql.*"%>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
String qr="select * from test where id=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setInt(1,1);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
String fname=rs.getString("img");
out.println(fname+"From Show Image");
%>
<img src=<%=fname%>></img>
<%
}
else
{
out.println("Not Successful...");
}	
%>
