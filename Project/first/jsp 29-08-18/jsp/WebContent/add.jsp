<%@page errorPage="error.jsp" %>
<%@include file="db.jsp" %>
<%
String name=request.getParameter("name");
String price=request.getParameter("price");
String cat=request.getParameter("cat");
String cmp=request.getParameter("cmp");
String qr="insert into product values(?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, name);
ps.setString(2, price);
ps.setString(3, cat);
ps.setString(4, cmp);
int i=ps.executeUpdate();
con.close();
%>
<%=i+" record added"%>