  
<%  
String name=request.getParameter("val");  
if(name==null||name.trim().equals("")){  
out.print("<p>Please enter student list</p>");  
}else{
int c=Integer.parseInt(name);
for(int i=1;i<=c;i++)
{
	%>
	<input type="text" name="sname<%=i %>" />
	<%
}
}
%>  