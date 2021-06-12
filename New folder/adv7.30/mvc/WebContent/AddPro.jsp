<%@page errorPage="error.jsp" %>
<jsp:useBean id="p" class="pp.Product"></jsp:useBean>
<jsp:setProperty property="*" name="p"/>
<jsp:useBean id="rd" class="pp.RegisterDao"></jsp:useBean>

<%
int i=rd.addProduct(p);
out.println(i+" record added");
%>