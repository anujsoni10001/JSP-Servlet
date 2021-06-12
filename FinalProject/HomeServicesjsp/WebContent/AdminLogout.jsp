<%
session.invalidate();
RequestDispatcher rd=request.getRequestDispatcher("admin.html");
rd.include(request,response);
out.println("Logged Out Succesful...");
%>


