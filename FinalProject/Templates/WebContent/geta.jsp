<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String id=request.getParameter("id");
String sid=request.getParameter("sid");
String date=request.getParameter("date");
String time=request.getParameter("time");
String email=(String)session.getAttribute("id");
String qr="insert into apoint(id,email,date,time,sid) values(?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,id);
ps.setString(2,email);
ps.setString(3,date);
ps.setString(4,time);
ps.setString(5,sid);
int i=ps.executeUpdate();
if(i!=0)
{
rd=request.getRequestDispatcher("showser.jsp");
rd.forward(request,response);
out.println("Booked Succesfully.....");
}
else
{
rd=request.getRequestDispatcher("showser.jsp");
rd.forward(request,response);
}	
%>