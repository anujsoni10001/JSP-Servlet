<%
String id=request.getParameter("id");
String pwd=request.getParameter("pwd");
if(id.equals("admin") && pwd.equals("root"))
{
RequestDispatcher rd=request.getRequestDispatcher("abc.jsp");
rd.forward(request,response);
}
else
{
RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
rd.include(request,response);
out.println("Invalid id or Password..");
}
%>