<%@page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Date st=new Date();
out.println(st);
%>
<h1>this is first jsp page</h1>
<form action="Calc.jsp">
num1<input type="text" name="n1" />
num2<input type="text" name="n2" />
<input type="submit" name="b" value="ADD" />
<input type="submit" name="b" value="SUB" />
<input type="submit" name="b" value="MUL" />
<input type="submit" name="b" value="DIV" />
</form>
<a href="admin.jsp">admin login</a>
</body>
</html>










