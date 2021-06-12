<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String id=request.getParameter("id");
String sid=request.getParameter("sid");
PreparedStatement ps;
String qr="delete from apoint where id=? and sid=?";
          ps=con.prepareStatement(qr);
          ps.setString(1,id);
          ps.setString(2,sid);
      	 int i=ps.executeUpdate();
    	  if(i!=0)
    	  {
    	  rd=request.getRequestDispatcher("spShowappint.jsp");
    	  rd.include(request, response);
    	  out.println("Deletion By ID Succesful");
    	  }
    	  else
    	  {
    	  rd=request.getRequestDispatcher("Deleteap.jsp");
	      rd.include(request, response);
	      out.println("Deletion By ID Not Succesful");
    	  }
%>