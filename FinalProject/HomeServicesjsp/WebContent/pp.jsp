<%
RequestDispatcher rd=request.getRequestDispatcher("userhome.jsp");
rd.include(request,response);
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Uploading Form</title>
<link rel="stylesheet" type="text/css" href="pp.css"> 
</head>
<body>
<h2 align=center>File Upload:</h2> <br>
<div class="hello">
<form action="pp1.jsp" enctype="multipart/form-data" method="post">
<input type="file" name="file"><br>
<input type="submit">
</form>
</div>
</body>
</html>