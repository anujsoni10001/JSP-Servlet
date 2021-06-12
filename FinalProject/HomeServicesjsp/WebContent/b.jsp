<%@page errorPage="error.jsp"%>
<%
String id=request.getParameter("id");
String sid=request.getParameter("sid");
RequestDispatcher rd=request.getRequestDispatcher("ShowPro.jsp");
rd.include(request,response);
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking Page</title>
<link rel="stylesheet" type="text/css" href="bh.css">
</head>
<body>
<div class="form-book">
<form action="geta.jsp" method="post">
<input type="hidden" name="id" value="<%=id%>">
<input type="hidden" name="sid" value="<%=sid%>">
<input type="date" name="date" class="date"><br>
<input type="radio" name="time" value="10 am" checked>10 am
<input type="radio" name="time" value="11 am"> 11 am
<input type="radio" name="time" value="12 pm"> 12 pm  
<input type="radio" name="time" value="1 pm">1 pm
<input type="radio" name="time" value="2 pm">2 pm
<input type="radio" name="time" value="3 pm">3 pm
<input type="radio" name="time" value="4 pm">4 pm 
<input type="radio" name="time" value="5 pm">5 pm
<input type="radio" name="time" value="6 pm">6 pm
<input type="radio" name="time" value="7 pm">7 pm
<input type="radio" name="time" value="8 pm">8 pm
<input type="radio" name="time" value="9 pm">9 pm<br>
<button type="submit">GETAPPOINTMENT</button><a href="showser.jsp"><button type="submit">CANCEL/BACK</button></a>
</form>
</div>
</body>
</html>
