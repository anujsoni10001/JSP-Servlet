<%
String apt_id=request.getParameter("a_id");
String chargesRM=request.getParameter("charges");
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>
</head>
<body>
<pre>
Appointment Id:<input type="text" placeholder=<%=apt_id%>>
Amount(RM):<input type="text" placeholder=<%=chargesRM%>>
<form action="Pay">
<input type="hidden" name="a_id" value=<%=apt_id%>>
<input type="hidden" name="charges" value=<%=chargesRM%>>
Card Type:<select name="card_type">
<option>Rupay</option>
<option>Master</option>
<option>VISA</option>
</select>
Card Number:<input type="text" name="card_number">
Expiry Date:<input type="date" name="expiry_date">
CVV2/CVC2:<input type="text" name="cvv">
<input type="submit" value="Confirm">
</form>
</pre>
</body>
</html>