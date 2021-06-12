<%@ page import="java.sql.*"%>  
  
<%  
String s=request.getParameter("val");  
if(s==null || s.trim().equals("")){  
out.print("Please enter students");  
}else{  
int id=Integer.parseInt(s);  
  try{  
	  for(int i=1;i<=id;i++)
	  {
		  out.println("Enter Details for Student "+i+" <br>");
		  out.println("ENTER ID of "+i+ "student <input type=text name=sid"+i+" /><br>");
		  out.println("ENTER NAME of "+i+ "student <input type=text name=stname"+i+" /><br>");
		  out.println("ENTER course of "+i+ "student <input type=text name=course"+i+" /><br>");
	  }
}catch(Exception e){e.printStackTrace();}  
}  
%>  