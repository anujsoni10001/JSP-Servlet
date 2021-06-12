<%@ page import="java.sql.*" %>  
<%  
String name=request.getParameter("val");  
if(name==null||name.trim().equals("")){  
out.print("<p>Please enter name!</p>");  
}else{  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","root");

PreparedStatement ps=con.prepareStatement("select * from emp where name like '"+name+"%'");  
ResultSet rs=ps.executeQuery();  
  
if(!rs.isBeforeFirst()) {      
 out.println("<p>No Record Found!</p>");   
}else{  
out.print("<table border='1' cellpadding='2' width='100%'>");  
while(rs.next()){  
	int id=rs.getInt("id");
	String nm=rs.getString("name");
	String job=rs.getString("job");
	%>
	<tr>
	<td><%=id %></td>
	<td><%=nm %></td>
	<td><%=job %></td>
	</tr>
	<%
}  
out.print("</table>");  
}//end of else for rs.isBeforeFirst  
con.close();  
}catch(Exception e){out.print(e);}  
}//end of else  
%>  