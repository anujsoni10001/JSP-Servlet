<%@page errorPage="error.jsp"%>
<%
String id=request.getParameter("id");
String sid=request.getParameter("sid");
RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
rd.include(request,response);
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking Page</title>
<link rel="stylesheet" type="text/css" href="css/bh1.css">
</head>
<body>
<div class="form-book">
<form action="geta.jsp" method="post">
<input type="hidden" name="id" value="<%=id%>">
<input type="hidden" name="sid" value="<%=sid%>">
<input type="date" name="date" class="date">
<input type="radio" name="time" value="10 am" checked><h6>10 am</h6>
<input type="radio" name="time" value="11 am"><h6> 11 am</h6>
<input type="radio" name="time" value="12 pm"><h6>12 pm</h6>  
<input type="radio" name="time" value="1 pm"><h6>1 pm</h6>
<input type="radio" name="time" value="2 pm"><h6>2 pm</h6>
<input type="radio" name="time" value="3 pm"><h6>3 pm</h6>
<input type="radio" name="time" value="4 pm"><h6>4 pm</h6> 
<input type="radio" name="time" value="5 pm"><h6>5 pm</h6>
<input type="radio" name="time" value="6 pm"><h6>6 pm</h6>
<input type="radio" name="time" value="7 pm"><h6>7 pm</h6>
<input type="radio" name="time" value="8 pm"><h6>8 pm</h6>
<input type="radio" name="time" value="9 pm"><h6>9 pm</h6>
<input type="radio" name="time" value="10 pm"><h6>10 pm</h6>
<input type="radio" name="time" value="11 pm"><h6>11 pm</h6>
<button type="submit">GETAPPOINTMENT</button>
</form>
<a href="show.jsp"><button>CANCEL/BACK</button></a>
</div>
</body>
</html>
