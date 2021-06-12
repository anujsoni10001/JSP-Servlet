<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addpro.jsp">
ID<input type="text" name="id"><br>
NAME<input type="text" name="name"><br>
CAT<select name="cat">
<option value="mobile">MOBILE</option>
<option value="laptop">LAPTOP</option>
</select><br>
CMP<select name="cmp">
<option value="Sony">SONY</option>
<option value="vivo">VIVO</option>
</select><br>
<input type="submit" value="ADD">
</form>

</body>
</html>