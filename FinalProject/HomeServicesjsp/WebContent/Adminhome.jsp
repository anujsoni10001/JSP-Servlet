<!--Drawbacks of Servalets is covered in this Page -->
<!DOCTYPE html>
<html>
<head>
<title>Update Student Details Page</title>
<link rel="stylesheet" type="text/css" href="h.css"> 
</head>
<body>
<%
String id=(String)session.getAttribute("id");
%>
<h3>Welcome to AdminHome Login@<%=id%></h3>
<div class="AdminHomePage">
<div class="Tools">
<a href=Addser2.html><button class="red">AddService</button></a>
<a href=delPro2.html><button class="blue">DelService</button></a>
<a href=Update.html><button class="green">UpdService</button></a>
<a href=ShowPro.jsp><button class="gray">ShowService</button></a>
<a href=AdminLogout.jsp><button class="red">LogOut</button></a>
<a href=AddServiceProvider.jsp><button class="red">Add Service Provider</button></a>
<a href=AdminLogout.jsp><button class="red">Update Service Provider</button></a>
<a href=AdminLogout.jsp><button class="red">Delete Service Provider</button></a>
<a href=AdminLogout.jsp><button class="red">Show Service Provider</button></a>
</div>
</div>
</body>
</html>
		