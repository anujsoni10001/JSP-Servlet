<%--///Concept of Java Use Bean Class
Java 5 Action Element 
Java Use Bean --%>
<%@page import="java.sql.SQLException"%>
<%@page errorPage="error.jsp"%>
<jsp:useBean id="pb" class="pp.ProductBean"></jsp:useBean>
<jsp:setProperty property="*" name="pb"/>
<%
pp.RegisteredDao rd=new pp.RegisteredDao();
int i=rd.update(pb);
if(i!=0)
{
out.println(i+" Upadation Succesful.. ");
}
else
{
out.println(i+"Updation Not Succesful.. ");
}
%>