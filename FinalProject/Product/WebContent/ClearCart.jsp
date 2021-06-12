<%@page import="java.sql.*"%>
<%
String id=request.getParameter("id");
int i;
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","root");
String qr="delete from cart where id=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,id);
i=ps.executeUpdate();
  if(i!=0)
  {
  RequestDispatcher rs=request.getRequestDispatcher("ShowCart.jsp");
  rs.include(request,response);
  out.println("Deletion Succesful...");
  }
  else
  {
  out.println("Deletion Not Succesful");
  }
%>