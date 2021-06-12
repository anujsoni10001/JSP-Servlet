<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
rd=request.getRequestDispatcher("userhome.jsp");
rd.include(request,response);
%>
<%
String fileName=request.getParameter("fileName");
String email=(String)session.getAttribute("id");
String qr="update user set img=? where email=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,fileName);
ps.setString(2,email);
int i=ps.executeUpdate();
if(i!=0)
{
%>
<%="Profile Picture Addition Succesful..."%>
<img src="<%=fileName%>">
<%
}
else
{
out.println("Not Successful...");
}	
%>
