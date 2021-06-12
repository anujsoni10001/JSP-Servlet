<%
session.invalidate();
RequestDispatcher rd=request.getRequestDispatcher("User.jsp");
rd.include(request,response);
out.println("Logged Out Succesful...");
%>


