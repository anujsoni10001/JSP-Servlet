<%@page import="pp.PatientAccountBean"%>
<%@page import="pp.RegisteredDao"%>
<%
String p_email=(String)session.getAttribute("p_id");
RegisteredDao rd=new RegisteredDao();
java.util.ArrayList<PatientAccountBean> a1=rd.ShowPro(p_email);
PatientAccountBean p=a1.get(0);
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My-Accounts</title>
</head>
<body>
<h3>My Accounts</h3>
<pre>
<form action="Update">
First Name : <input type="text" name="fname" placeholder=<%=p.getFirstName()%> >
Last Name : <input type="text" name="lname" placeholder=<%=p.getLastName()%>>
Telephone : <input type="text" name="telephone" placeholder=<%=p.getTelephone()%> >
Address : <input type="text" name="address" placeholder=<%=p.getAddress()%> >
<input type="submit" value="Update"/>  
</form>
</pre>
</body>
</html>