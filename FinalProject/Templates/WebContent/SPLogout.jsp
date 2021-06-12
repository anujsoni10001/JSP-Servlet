<%
session.invalidate();
RequestDispatcher rd=request.getRequestDispatcher("home.html");
rd.forward(request,response);
out.println("Logged Out Succesful...");
%>


