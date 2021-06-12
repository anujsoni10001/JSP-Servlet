<%@page errorPage="error.jsp" %>
<%@page import="pp.RegisterDao"%>
<%@page import="pp.Product"%>
<jsp:useBean id="p" class="pp.Product"></jsp:useBean>
<jsp:setProperty property="name" name="p"/>
<%
RegisterDao rd=new RegisterDao();
int i=rd.delPro(p);
if(i>0)
{
	RequestDispatcher rd1=request.getRequestDispatcher("Show.jsp");
	rd1.include(request, response);
	out.println(p.getName()+" record deleted");
}
else
{
	RequestDispatcher rd1=request.getRequestDispatcher("Show.jsp");
	rd1.include(request, response);
	out.println("no record deleted");
}
%>