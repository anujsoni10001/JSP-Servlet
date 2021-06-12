<%@page import="java.util.ArrayList" %>
<%
String tid=request.getParameter("id");
String tname=request.getParameter("tname");
String count=request.getParameter("name");
int c=Integer.parseInt(count);
ArrayList<String> al=new ArrayList<String>();
for(int i=1;i<=c;i++)
{
	al.add(request.getParameter("sname"+i));
}
out.println(tid+" "+tname);
for(String s:al)
{
	out.println(s);
}
%>