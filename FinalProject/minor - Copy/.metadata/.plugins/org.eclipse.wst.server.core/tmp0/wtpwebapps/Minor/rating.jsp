<%@page import="pp.RegisteredDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h3 align="center">Consultation-rating-page</h3>
<body>
<%
String p_email=(String)session.getAttribute("p_id");
RegisteredDao rd=new RegisteredDao();
java.util.ArrayList<pp.PatientAccountBean> a1=rd.ShowPro(p_email);
pp.PatientAccountBean p=a1.get(0);
int a_id=p.getAccountId();
RegisteredDao rd1=new RegisteredDao();
java.util.ArrayList<pp.Appointment> v=rd1.ShowCompletedAppoint(a_id);
%>
<table border=1 align="center">
<tr>
<th>Appointment-ID</th>
<th>Hospital-Name</th> 
<th>Doctor-Name</th>
<th>Date-Time</th>
<th>Status</th> 
</tr>
<%
for(pp.Appointment a:v)
{
%>
<tr>
<td><%=a.getAppointmentId()%></td>
<td><%=a.getHospitalName()%></td>
<td><%=a.getDoctorName()%></td>
<td><%=a.getDate()%></td>
<td><%=a.getStatus()%></td>
<td><a href="rate1.jsp?a_id=<%=a.getAppointmentId()%>">Rate</a></td>
</tr>
<% 
}
%>
</table>
</body>
</html>