<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String ch=request.getParameter("b");
String qr="";
PreparedStatement ps;
int i;
switch(ch)
{
case "ID":qr="delete from Product where id=?";
          ps=con.prepareStatement(qr);
          ps.setString(1,id);
      	  i=ps.executeUpdate();
    	  if(i!=0)
    	  {
    	  out.println("Deletion By ID Succesful");
    	  }
    	  else
    	  {
          out.println("Deletion By ID Succesful");
    	  }
	      break;
case "NAME":qr="delete from Product where Name=?";
          ps=con.prepareStatement(qr);
          ps.setString(1,name);
          i=ps.executeUpdate();
            if(i!=0)
            {
            out.println("Deletion By Name Succesful");
            }
            else
            {
            out.println("Deletion By Name Not Succesful");
            }
            break;
}
%>
