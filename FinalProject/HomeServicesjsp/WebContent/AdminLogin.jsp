<%
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		if(id.equals("admin") && pwd.equals("root"))
		{
        session.setAttribute("id",id);
        response.sendRedirect("Adminhome.jsp");	
		}
		else
		{
		RequestDispatcher rd=request.getRequestDispatcher("admin.html");
		rd.include(request,response);
		out.println("Invalid ID or Password...");
		}
%>