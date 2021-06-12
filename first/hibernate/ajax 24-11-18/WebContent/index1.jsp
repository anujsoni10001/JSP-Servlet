<%@ page import="java.sql.*"%>  
  <table border="1">
<%  
String s=request.getParameter("val");  
if(s==null || s.trim().equals("")){  
out.print("Please enter id");  
}else{  

//out.print(id);  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajax","root","root");  
PreparedStatement ps=con.prepareStatement("select * from state where sname=?");  
ps.setString(1, s);
ResultSet rs=ps.executeQuery();
out.println("<select>");
while(rs.next()){

String name=rs.getString("city");
%>
<option><%=name %></option>
<%
}  
con.close();  
}catch(Exception e){e.printStackTrace();}  
}  
%>  
</select>