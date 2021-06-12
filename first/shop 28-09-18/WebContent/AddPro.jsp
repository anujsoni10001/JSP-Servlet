<%@page import="mvc.RegisterDao"%>
<jsp:useBean id="p" class="mvc.Product"></jsp:useBean>
<jsp:setProperty property="*" name="p"/>
<%
RegisterDao rd=new RegisterDao();
int i=rd.addProduct(p);
%>
<%=i+" record added"%>