<%@page errorPage="error.jsp"%>
<%
String id=(String)session.getAttribute("id");
%>
<%="Welcome User @:"+id%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product Page</title>
</head>
<body>
<form action="add1.jsp" method="post">
<pre>
Enter the Product ID<input type="text" name="id">
Enter the Product Name to Add <input type="text" name="productname">
Enter the Product Price       <input type="text" name="price">
Select the  Product Categories      <select name="cat">
<option>Mobile</option>
<option>Laptop</option>
<option>AC</option>
<option>TV</option>
<option>WashingMachine</option>
<option>Other</option>
</select>
Select the  Product Company Name<select name="com">
<option>LG</option>
<option>Samsung</option>
<option>Xoami</option>
<option>HP</option>
<option>Lenovo</option>
</select>
<input type="submit" value="ADD PRODUCT">
</pre>
</form>
</body>
</html>
