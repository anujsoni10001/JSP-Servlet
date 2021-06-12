<%@ page import="java.sql.*"%>  
  
<%  
String s=request.getParameter("val");  
if(s==null || s.trim().equals("")){  
out.print("Please select state");  
}else{  
//int id=Integer.parseInt(s);  
//out.print(id);  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/archit","root","root");  
PreparedStatement ps=con.prepareStatement("select * from state where sname=?");  
ps.setString(1,s);  
ResultSet rs=ps.executeQuery();  

if(rs.next()){  
out.println("<select>");
do
{
	out.println("<option>");
	out.println(rs.getString("city"));
	out.println("</option>");
}while(rs.next());
out.println("</select>");
} else
{
	out.println("no record found");
}
con.close();  
}catch(Exception e){e.printStackTrace();}  
}  
%>  