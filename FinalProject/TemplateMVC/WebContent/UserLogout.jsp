<%
session.invalidate();
RequestDispatcher rd=request.getRequestDispatcher("ULogin.html");
rd.include(request,response);
out.println("Logged Out Succesful...");
%>


