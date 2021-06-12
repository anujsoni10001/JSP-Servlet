<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
		String Name=request.getParameter("Name");
		String id=request.getParameter("id");
		String Price=request.getParameter("Price");
		String Category=request.getParameter("Category");
		String Company=request.getParameter("Company");
		int i=0;
	    String qr="update Product set Name=?,Price=?,Category=?,Company=? where id=?";
	    PreparedStatement ps=con.prepareStatement(qr);
		ps.setString(1,Name);
		ps.setString(2,Price);
		ps.setString(3,Category);
		ps.setString(4,Company);
		ps.setString(5,id);
		i=ps.executeUpdate();
	    if(i!=0)
		{
	    RequestDispatcher rs=request.getRequestDispatcher("ShowPro");
	  	rs.include(request,response);
	  	%>
	  	<h5 align=center><%=i+"Record Updated Sucessfully..."%></h5>
	  	<%
        }
		else
		{
        out.println("Updation By ID Not Succesful");
		}
	    ps.close();
%>