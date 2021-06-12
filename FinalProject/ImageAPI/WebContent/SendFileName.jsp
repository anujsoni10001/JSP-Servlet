
<!--
////Conclusion:- Update is Better in this case then insert Query.....
///Insert FileName to the Database...
////Database Name :- test
///Database Relation Name :- test-->

<%@page import="java.sql.*"%>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
String fileName=request.getParameter("fileName");
String qr="update test set img=? where id=1";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,fileName);
int i=ps.executeUpdate();
if(i!=0)
{
%>
<%="Profile Picture Addition Succesful..."%>
<img src=<%=fileName%>></img>
<%
}
else
{
out.println("Not Successful...");
}	
%>
