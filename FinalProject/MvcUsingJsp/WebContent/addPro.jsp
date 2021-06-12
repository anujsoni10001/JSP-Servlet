<%--///Concept of Java Use Bean Class
Java 5 Action Element 
Java Use Bean --%>
<%@page import="java.sql.SQLException"%>
<%@page errorPage="error.jsp"%>
<jsp:useBean id="pb" class="pp.ProductBean"></jsp:useBean>
<jsp:setProperty property="*" name="pb"/>
<%
pp.RegisteredDao rd=new pp.RegisteredDao();
int i=rd.addPro(pb);
if(i!=0)
{
RequestDispatcher rd1=request.getRequestDispatcher("show.jsp");
rd1.include(request,response);
out.println(i+" Addition Succesful.. ");
}
else
{
RequestDispatcher rd1=request.getRequestDispatcher("show.jsp");
rd1.include(request,response);
out.println(i+"Addition Not Succesful.. ");
}
%>