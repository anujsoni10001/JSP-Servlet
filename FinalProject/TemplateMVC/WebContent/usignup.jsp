<%--///Concept of Java Use Bean Class
Java 5 Action Element 
Java Use Bean --%>
<%@page import="java.sql.SQLException"%>
<%@page errorPage="error.jsp"%>
<jsp:useBean id="us" class="pp.UserSignUp"></jsp:useBean>
<jsp:setProperty property="*" name="us"/>
<%
pp.RegisteredDao rd=new pp.RegisteredDao();
int i=rd.addUser(us);
if(i!=0)
{
RequestDispatcher rd1=request.getRequestDispatcher("ULogin.html");
rd1.include(request,response);
out.println(i+" Registration Succesful.. ");
}
else
{
RequestDispatcher rd1=request.getRequestDispatcher("ULogin.html");
rd1.include(request,response);
out.println(i+"Addition Not Succesful.. ");
}
%>