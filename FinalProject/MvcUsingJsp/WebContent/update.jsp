<!--MVC THROUGH SERVLET IS MORE Complex as compared to JSP ///-->
<!--This Page is View of the Model View Controller-->
<!--Through use of MVC the code is separated . It is used in Corporate-s-->
<!--Few Drawbacks -->
<!-- Console->ellipse -->
<!-- Driver->Connection -->
<jsp:useBean id="i" class="pp.ProductBean"></jsp:useBean>
<jsp:setProperty property="id" name="i"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update-Page</title>
</head>
<body>
<form action="upPro.jsp">
<pre>
<input type="hidden" name="id" value="<%=i.getId()%>">
Product Name<input type="text" name="name">
Product Categories<input type="text" name="cat">
Product Company<input type="text" name="cmp">
Product Price<input type="text" name="price">
<input type="submit" value="PRODUCT REGISTER">
</pre>
</form>
</body>
</html>