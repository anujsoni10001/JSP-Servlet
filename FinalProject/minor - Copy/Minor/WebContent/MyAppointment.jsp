<%@page import="pp.RegisteredDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
window.location.hash="no-back-button";
window.location.hash="Again-No-back-button";//again because google chrome don't insert first hash into history
window.onhashchange=function(){window.location.hash="no-back-button";}
</script>
<body>
<h3 align="center">My Appointments..</h3>
<table border=1 align="center"> 
<tr>
<th>Appointment-ID</th>
<th>Hospital-Name</th> 
<th>Doctor-Name</th>
<th>Date-Time</th>
<th>Status</th> 
</tr>
<%
String email=(String)session.getAttribute("p_id");
RegisteredDao rd=new RegisteredDao();
java.util.ArrayList<pp.PatientAccountBean> pab=rd.ShowPro(email);
pp.PatientAccountBean p=pab.get(0);
int a_id=p.getAccountId();
RegisteredDao rd1=new RegisteredDao();
java.util.ArrayList<pp.Appointment> a=rd1.ShowAppoint(a_id);
for(pp.Appointment v:a)
{
%>
<tr>
<td><%=v.getAppointmentId()%></td>
<td><%=v.getHospitalName()%></td>
<td><%=v.getDoctorName()%></td>
<td><%=v.getDate()%></td>
<td><%=v.getStatus()%></td>
<td><a href="upateapoint.jsp?a_id=<%=v.getAppointmentId()%>">Update</a></td>
<td><a href="cancel.jsp?a_id=<%=v.getAppointmentId()%>">Cancel</a></td>
<td><a href="MakePayment.jsp?a_id=<%=v.getAppointmentId()%>&charges=<%=v.getChargesRM()%>">Pay</a></td>
</tr>
<%									
} 
%>
</table>
<a href="home.html">Go-Home</a>
</body>
</html>