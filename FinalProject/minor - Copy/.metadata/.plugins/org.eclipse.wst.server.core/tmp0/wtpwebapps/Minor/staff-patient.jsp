<%
RequestDispatcher rd=request.getRequestDispatcher("patientrecord.jsp");
rd.include(request,response);
RequestDispatcher rd1=request.getRequestDispatcher("staff-patient2.jsp");
rd1.include(request,response);
%>