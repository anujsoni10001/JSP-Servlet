
<!--///Get FileName from the Database...
////Database Name :- test
///Database Relation Name :- test-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*"%>
<%
String email=(String)session.getAttribute("p_id");
pp.RegisteredDao r=new pp.RegisteredDao();
java.util.ArrayList<pp.PatientAccountBean> p=r.ShowPro(email);
pp.PatientAccountBean pa=p.get(0);
int account_id=pa.getAccountId();
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
String qr="select * from accounts where AccountId=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setInt(1,account_id);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
String fname=rs.getString("img");
%>
<img src=<%=fname%> height="100" width="100"></img>
<%
}
else
{
out.println("Not Successful...");
}	
%>
<a href="Appointment2.jsp">New Appointment</a>
<a href="MyAppointment.jsp">My Appointment</a>
<a href="imageindex.html">Add Profile</a>
<a href="MyAccount.jsp">My Account</a>
<a href="rating.jsp">Consultation-rating-page</a>
<a href="doctorrecords.jsp">Doctor-Records</a>
<a href="LogOut">LogOut</a>
</body>
</html>