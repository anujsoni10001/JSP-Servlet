<%@page import="pp.RegisteredDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Patients Record..</h2>
<body>
<%
pp.RegisteredDao rd=new RegisteredDao();
java.util.ArrayList<pp.PatientAccountBean> a1=rd.ShowallPatient();
%>
<table border=1>
<tr>
<th>Account-Id</th>
<th>First-Name</th> 
<th>Last-Name</th>
<th>Email</th>
<th>Telephone</th>
<th>Address</th> 
</tr>
<% 
for(pp.PatientAccountBean p:a1)
{
%>
<tr>
<td><%=p.getAccountId()%></td>
<td><%=p.getFirstName()%></td>
<td><%=p.getLastName()%></td>
<td><%=p.getEmail()%></td>
<td><%=p.getTelephone()%></td>
<td><%=p.getAddress()%></td>
<td><a href="staff-patient.jsp?a_id=<%=p.getAccountId()%>&fname=<%=p.getFirstName()%>&lname=<%=p.getLastName()%>&email=<%=p.getEmail()%>&telephone=<%=p.getTelephone()%>&address=<%=p.getAddress()%>">Update</a></td>
<td><a href="delete_patient.jsp?a_id=<%=p.getAccountId()%>">Delete</a></td>
</tr>
<%
}
%>
</table>
</body>
</html>