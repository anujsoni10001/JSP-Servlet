<%@page import="java.sql.*" %>
<!DOCTYPE html>  
<html>  
<head>  
<%
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajax","root","root");  
String qr="select distinct sname from state";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(qr);
%>
<script>  
var request=new XMLHttpRequest();  
function searchInfo(){  
var name=document.vinform.name.value;  
var url="index1.jsp?val="+name;  
  
try{  
request.onreadystatechange=function(){  
if(request.readyState==4){  
var val=request.responseText;  
document.getElementById('mylocation').innerHTML=val;  
}  
}//end of function  
request.open("GET",url,true);  
request.send();  
}catch(e){alert("Unable to connect to server");}  
}  
</script>  
</head>  
<body>  
<h1>Search Employee</h1>  
<form name="vinform">  
  
<select name="name" onChange="searchInfo()" >
<%
while(rs.next())
{
	String name=rs.getString("sname");
%>
<option value="<%=name%>"><%=name%></option>
<%
}
%>
</select>
</form>  
  
<span id="mylocation"></span>  
</body>  
</html> 