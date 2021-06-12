<%@page import="pp.Appointment"%>
<%
String a_id=request.getParameter("a_id");
int u=Integer.parseInt(a_id);
pp.RegisteredDao rd=new pp.RegisteredDao();
Appointment p=new Appointment();
p.setAppointmentId(u);
int i=rd.delete(p);
if(i!=0)
{
RequestDispatcher rd1=request.getRequestDispatcher("MyAppointment.jsp");
rd1.include(request,response);
out.println("Deleted..");
}
else
{
RequestDispatcher rd1=request.getRequestDispatcher("MyAppointment.jsp");
rd1.include(request,response);
out.println("Not Deleted..");
}
%>