<!--Drawbacks of Servalets is covered in this Page -->
<!DOCTYPE html>
<html>
<head>
<title>Update Student Details Page</title>
<link rel="stylesheet" type="text/css" href="h.css"> 
</head>
<body>
<%
String sid=(String)session.getAttribute("sid");
%>
<h3>Welcome to ServiceProvider Home Login@<%=sid%></h3>
<div class="AdminHomePage">
<div class="Tools">
<a href=spShowappint.jsp><button class="red">Show Appointments</button></a>
<a href=Addser2.jsp><button class="blue">Add Service</button></a>
<a href=delPro2.html><button class="blue">Delete Service</button></a>
<a href=SPLogout.jsp><button class="blue">Logout</button></a>
</div>
</div>
</body>
</html>
		