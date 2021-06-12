<%@page errorPage="error.jsp"%>
<%--///Concept of Java Use Bean Class
Java 5 Action Element 
Java Use Bean --%>
<%@page import="java.sql.SQLException"%>
<%@page errorPage="error.jsp"%>
<jsp:useBean id="ap" class="pp.apoint"></jsp:useBean>
<jsp:setProperty property="id" name="ap"/>
<jsp:setProperty property="sid" name="ap"/>
<jsp:setProperty property="date" name="ap"/>
<jsp:setProperty property="time" name="ap"/>
<%
String email=(String)session.getAttribute("id");
ap.setEmail(email);
pp.RegisteredDao rd=new pp.RegisteredDao();
int i=rd.addapoint(ap);
if(i!=0)
{
RequestDispatcher rd1=request.getRequestDispatcher("show.jsp");
rd1.forward(request,response);
out.println("Apointment Booked Succesfully.....");
}
else
{
RequestDispatcher rd1=request.getRequestDispatcher("show.jsp");
rd1.forward(request,response);
out.println("Apointment Not Booked Succesfully.....");
}	
%>