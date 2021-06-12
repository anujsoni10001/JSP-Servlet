<%
///Scriptlet Tag and Expression Tag are both internally in the Service
//Method..
session.invalidate();
RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
rd.include(request,response);
%>
<%="Logout Succesfull...."%>