<%
session.invalidate();
RequestDispatcher rd=request.getRequestDispatcher("ServiceProviderLogin.jsp");
rd.include(request,response);
out.println("Logged Out Succesful...");
%>


