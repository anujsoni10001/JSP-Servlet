<%@ page import="java.sql.*"%>  
  <table border="1">
<%  
String s=request.getParameter("val");  
if(s==null || s.trim().equals("")){  
out.print("Please enter id");  
}else{  
int id=Integer.parseInt(s);  
//out.print(id);  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hib1","root","root");  
PreparedStatement ps=con.prepareStatement("select * from emp where id=?");  
ps.setInt(1,id);  
ResultSet rs=ps.executeQuery();  
while(rs.next()){
	int id1=rs.getInt("id");
String name=rs.getString("name");
%>
<tr>
<td><%=id1 %></td>
<td><%=name %></td>
</tr>
<%
}  
con.close();  
}catch(Exception e){e.printStackTrace();}  
}  
%>  
</table>