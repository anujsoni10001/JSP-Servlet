<%@ page import="java.sql.*"%>  
  
<%  
String s=request.getParameter("val");  
if(s==null || s.trim().equals("")){  
out.print("Please enter id");  
}else{  
int id=Integer.parseInt(s);  
out.print(id);  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/archit","root","root");  
PreparedStatement ps=con.prepareStatement("select * from emp where id=?");  
ps.setInt(1,id);  
ResultSet rs=ps.executeQuery();  

if(rs.next()){  
out.print(rs.getInt("id")+" "+rs.getString("name"));  
} else
{
	out.println("no record found");
}
con.close();  
}catch(Exception e){e.printStackTrace();}  
}  
%>  