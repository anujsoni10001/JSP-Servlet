<%@include file="db.jsp"%>
<%@page errorPage="error.jsp"%>
<%
String productname=request.getParameter("productname");
String id=request.getParameter("id");
String price=request.getParameter("price");
String cat=request.getParameter("cat");
String com=request.getParameter("productname");
String qr="insert into Product values(?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(5,id);
ps.setString(1,productname);
ps.setString(2,price);
ps.setString(3,cat);
ps.setString(4,com);
int i=ps.executeUpdate();
if(i!=0)
{
rd=request.getRequestDispatcher("addPro.jsp");
rd.include(request,response);
%>
<%--//Concept of Nested Tagging in JSP(Java Server Page)--%>
<%="Insetion Succesful...."%>
<%
}
else
{
rd=request.getRequestDispatcher("addPro.jsp");
rd.include(request,response);
%>
<%--//Concept of Nested Tagging in JSP(Java Server Page)--%>
<%="Insetion Not Succesful...."%>
<%
}
%>