<%
String id=request.getParameter("id");
String pwd=request.getParameter("pwd");
if(id.equals("admin")&&pwd.equals("12345"))
{
response.sendRedirect("new.jsp");	
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
	rd.include(request,response);
	%>
	<center>
	<%="Invalid Id and Password"%>
	</center>
	<%	
}
%>