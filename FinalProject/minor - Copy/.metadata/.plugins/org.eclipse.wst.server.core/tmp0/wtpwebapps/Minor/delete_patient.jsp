<%@page import="pp.PatientAccountBean"%>
<%@page import="pp.RegisteredDao"%>
<%
String account_id=request.getParameter("a_id");
int s=Integer.parseInt(account_id);
RegisteredDao rd=new RegisteredDao();
PatientAccountBean p=new PatientAccountBean();
p.setAccountId(s);
int i=rd.delete(p);
if(i!=0)
{
RequestDispatcher rd1=request.getRequestDispatcher("patientrecord.jsp");
rd1.include(request,response);
out.println("Deleted...");
}
else
{
RequestDispatcher rd1=request.getRequestDispatcher("patientrecord.jsp");	
rd1.include(request,response);
out.println("Deleted...");	
}
%>
