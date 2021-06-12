<%-- 
//Here we use ///out,request,response,session/// implict object provided by JSP
//JSP(Java Server Page)
//Meaning of impicit :- Object that are internally defined programmer can use
//it
//Nahi bhi user lagaye to bhi execute hota hai  
--%>
<%

String id=request.getParameter("id");
String pwd=request.getParameter("pwd");
if(id.equals("admin") && pwd.equals("root"))
{
session.setAttribute("id",id);
response.sendRedirect("adminhome.jsp");
}
else
{
RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
rd.include(request,response);
out.println("Invalid id or Password..");
}
%>