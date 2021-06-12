<jsp:useBean id="e" class="pp.Emp"></jsp:useBean>
<jsp:setProperty property="*" name="e"/>
<jsp:useBean id="rd" class="pp.RegisterDao"></jsp:useBean>
<%
int i=rd.Update(e);
out.println(i+" record updated");
%>