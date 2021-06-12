<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String sid=request.getParameter("sid");
String id=request.getParameter("id");
String date=request.getParameter("date");
String message=request.getParameter("message");
String tyservice=request.getParameter("tyservice");
String Location=request.getParameter("Location");
String mnumber=request.getParameter("mnumber");
String t=request.getParameter("t");
String t1=request.getParameter("t1");
String a[]=request.getParameterValues("a");
String b="";
for(int i=0;i<a.length;i++)
{
b=a[i]+b;
}
String qr="insert into addser values(?,?,?,?,?,?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,id);
ps.setString(2,tyservice);
ps.setString(3,Location);
ps.setString(4,mnumber);
ps.setString(5,t);
ps.setString(6,t1);
ps.setString(7,b);
ps.setString(8,sid);
ps.setString(9,date);
ps.setString(10,message);
int i=ps.executeUpdate();
if(i!=0)
{
rd=request.getRequestDispatcher("index.jsp");
rd.include(request,response);
%>
<%="Addition Succesful..."%>
<%
}
else
{
	rd=request.getRequestDispatcher("#");
	rd.include(request,response);
%>
<%="Addition Not Succesful..."%>
<%
}	
%>