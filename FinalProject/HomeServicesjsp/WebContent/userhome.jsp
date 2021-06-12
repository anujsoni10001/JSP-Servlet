<%@page import="java.sql.*"%>
<!--Drawbacks of Servalets is covered in this Page -->
<!DOCTYPE html>
<html>
<head>
<script>
window.location.hash="no-back-button";
window.location.hash="Again-No-back-button";//again because google chrome don't insert first hash into history
window.onhashchange=function(){window.location.hash="no-back-button";}
</script> 
<title>Update Student Details Page</title>
<link rel="stylesheet" type="text/css" href="abc.css"> 
</head>
<body>
<%
String email=(String)session.getAttribute("id");
%>
<h3>Welcome to User Home Login</h3><%="@"+email%>
<div class="AdminHomePage">
<div class="Tools">
<a href=ShowPro.jsp><button class="red">Show Services</button></a>
<a href=UserLogout.jsp><button class="red">LogOut</button></a>
<a href=pp.jsp><button class="red">AddProfilePicture</button></a>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
String qr="select img from user where email=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,email);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
String fname=rs.getString("img");
%>
<img src=<%=fname%> width="89" height="38" class="image"></img>
<%
}
else
{
out.println("Not Successful...");
}	
%>
</div>
</div>
</body>
</html>
		