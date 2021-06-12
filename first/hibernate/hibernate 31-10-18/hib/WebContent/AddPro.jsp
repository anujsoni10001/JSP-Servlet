<%@page import="pp.*"%>
<jsp:useBean id="i" class="pp.Product"></jsp:useBean>
<jsp:setProperty property="*" name="i"/>
<%
RegisterDao rd=new RegisterDao();
int j=rd.addPro(i);
out.println(j+" record added");
%>