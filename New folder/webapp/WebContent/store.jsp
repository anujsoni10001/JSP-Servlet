<%
String tid=request.getParameter("id");
String name=request.getParameter("name");
String sid[]=request.getParameterValues("sid");
String stname[]=request.getParameterValues("stname");
String course[]=request.getParameterValues("course");
%>
<%=tid%><br>
<%=name%><br>
<%
for(String i:sid)
{
	out.println(i);
}
%>