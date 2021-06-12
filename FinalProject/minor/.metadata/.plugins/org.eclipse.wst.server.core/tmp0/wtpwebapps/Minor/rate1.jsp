<%
RequestDispatcher rd=request.getRequestDispatcher("rating.jsp");
rd.include(request,response);
RequestDispatcher rd1=request.getRequestDispatcher("Rate.jsp");
rd1.include(request,response);
%>