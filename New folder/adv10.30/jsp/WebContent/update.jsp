<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updatepro.jsp">
Enter old ID<input type="text" name="id">
Enter New NAME<input type="text" name="name">
Enter New CAT<select name="cat">
<option value="mobile">MOBILE</option>
<option value="laptop">LAPTOP</option>
<option value="tab">TAB</option>
</select>
Enter New CMP<select name="cmp">
<option value="samsung">SAMSUNG</option>
<option value="lg">LG</option>
<option value="sony">SONY</option>
</select>
<input type="submit" value="Update">
</form>

</body>
</html>