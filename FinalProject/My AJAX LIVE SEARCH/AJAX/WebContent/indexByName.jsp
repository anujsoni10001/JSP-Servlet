<!-- 
Property	Description
onreadystatechange	Defines a function to be called when the readyState property changes
readyState	Holds the status of the XMLHttpRequest.
0: request not initialized 
1: server connection established
2: request received 
3: processing request 
4: request finished and response is ready
 -->
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
String s=request.getParameter("val");
if(s==null || s.trim().equals(""))
{
out.println("Enter the Name");	
}
else
{
try 
{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","root");  
Statement st=con.createStatement();  
ResultSet rs=st.executeQuery("select * from emp where name like '"+s+"%'");
if(rs.next())
{
out.println(rs.getString("id")+" "+rs.getString("name"));
}
else
{
out.println("no record Found..");
}
con.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
%>
</head>
<body>
</body>
</html>