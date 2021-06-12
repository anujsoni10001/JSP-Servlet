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
<%@page import="pp.RegisteredDao"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<%
String s=request.getParameter("val");
int i=Integer.parseInt(s);
if(s==null || s.trim().equals(""))
{
out.println("Select the State:-");	
}
else
{ 
try 
{
RegisteredDao rd=new RegisteredDao();
java.util.ArrayList<pp.Doctor> a1=rd.ShowPro(i);
for(pp.Doctor d:a1)
{
%>
Doctors-Name:<input type="text" placeholder=<%=d.getDcotorName()%>>
Doctors-Specialty: <input type="text" placeholder=<%=d.getDescription()%>>
Work in Hospital:<input type="text" placeholder=<%=d.getHospitalName()%>>
Year of Experience:<input type="text" placeholder=<%=d.getYearOfExperience()%>>
<%
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
%>
</body>
</html>