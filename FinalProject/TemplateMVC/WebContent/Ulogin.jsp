<%--///Concept of Java Use Bean Class
Java 5 Action Element 
Java Use Bean --%>
<%@page import="pp.UserSignUp"%>
<%@page import="java.sql.SQLException"%>
<%@page errorPage="error.jsp"%>
<jsp:useBean id="us" class="pp.UserSignUp"></jsp:useBean>
<jsp:setProperty property="email" name="us"/>
<jsp:setProperty property="pwd" name="us"/>
<%
pp.RegisteredDao rd=new pp.RegisteredDao();
java.util.ArrayList<UserSignUp> a1=rd.ShowUser();
for(UserSignUp u:a1)
{
if((us.getPwd()).equals(u.getPwd()) && (us.getEmail()).equals(u.getEmail()))
{
session.setAttribute("id",us.getEmail());
RequestDispatcher rd1=request.getRequestDispatcher("uhome.jsp");
rd1.forward(request,response);
out.println("Login Succesful...");
}
}
%>

