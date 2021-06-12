<jsp:useBean id="p" class="pp.Product"></jsp:useBean>
<jsp:setProperty property="name" name="p"/>
<jsp:useBean id="rd" class="pp.RegisterDao"></jsp:useBean>
<%
int i=rd.delete(p);
out.println(i+" record deleted");
%>