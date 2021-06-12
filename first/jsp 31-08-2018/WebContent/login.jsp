<%
String id=request.getParameter("id");
String pwd=request.getParameter("pwd");
if(id.equals("admin")&&pwd.equals("12345"))
{
	%>
	<jsp:forward page="Home.jsp"></jsp:forward>
	<%
}
else
{
	out.println("Invalid id and password");
}
%>