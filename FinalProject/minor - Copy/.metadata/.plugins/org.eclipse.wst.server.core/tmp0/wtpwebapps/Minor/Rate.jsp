<%
String a_id=request.getParameter("a_id");
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form align="center" action="Rate">
<input type="hidden" value=<%=a_id%> name="Apoint_id">
Rate your Consultation Experience ,it will us to improve our service
<input type="radio" name="rate" value="5"> Very Good
<input type="radio" name="rate" value="4"> Good
<input type="radio" name="rate" value="3"> Fair
<input type="radio" name="rate" value="2"> Poor
<input type="radio" name="rate" value="1"> Very Poor
<input type="submit">
</form>
</body>
</html>