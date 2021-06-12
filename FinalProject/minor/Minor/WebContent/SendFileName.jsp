
<!--
////Conclusion:- Update is Better in this case then insert Query.....
///Insert FileName to the Database...
////Database Name :- test
///Database Relation Name :- test-->

<%@page import="pp.RegisteredDao"%>
<%@page import="java.sql.*"%>
<%
String email=(String)session.getAttribute("p_id");
RegisteredDao r=new RegisteredDao();
java.util.ArrayList<pp.PatientAccountBean> p=r.ShowPro(email);
pp.PatientAccountBean pa=p.get(0);
int account_id=pa.getAccountId();
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/minor","root","root");
String fileName=request.getParameter("fileName");
String qr="update accounts set img=? where AccountId=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,fileName);
ps.setInt(2,account_id);
int i=ps.executeUpdate();
if(i!=0)
{
response.sendRedirect("home.jsp");
}
else
{
out.println("Not Successful...");
}	
%>
