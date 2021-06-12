<%@page errorPage="error.jsp" %>
<%@page import="pp.RegisterDao"%>
<%@page import="pp.Product"%>
<jsp:useBean id="p" class="pp.Product"></jsp:useBean>
<jsp:setProperty property="*" name="p"/>
<%
pp.RegisterDao rd=new RegisterDao();
int i=rd.addProduct(p);
if(i>0)
{
	response.sendRedirect("Show.jsp");
}
else
{
	response.sendRedirect("Show.jsp");
}
%>