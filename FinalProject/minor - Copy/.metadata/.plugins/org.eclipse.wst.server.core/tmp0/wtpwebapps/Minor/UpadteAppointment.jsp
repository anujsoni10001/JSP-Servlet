<!-- 
Property	Description
onreadystatechange	Defines a function to be called when the readyState property changes
readyState	Holds the status of the XMLHttpRequest.
0: request not initialized 
1: server connection established
2: request received 
3: processing request 
4: request finished and response is ready
 -->
<%@page import="pp.RegisteredDao"%>
<html>  
<head>  
<script>  
var request;  
function sendInfo()  
{  
var v=document.vinform.t1.value;  
var url="index2.jsp?val="+v;  
  
if(window.XMLHttpRequest){  
request=new XMLHttpRequest();  
}  
else if(window.ActiveXObject){  
request=new ActiveXObject("Microsoft.XMLHTTP");  
}  
  
try{  
request.onreadystatechange=getInfo;  
request.open("GET",url,true);  
request.send();  
}catch(e){alert("Unable to connect to server");}  
}  
  
function getInfo(){  
if(request.readyState==4){  
var val=request.responseText;  
document.getElementById('amit').innerHTML=val;  
}  
}  
</script>  
</head>  
<body>  
<marquee><h1>Update Appointment</h1></marquee>  
<pre>
<form name="vinform" action="UpdateApoint">  
<%
String a_id=request.getParameter("a_id");
%>
<input type="hidden" value=<%=a_id%> name="a_id">
Doctor-ID<select name="t1" onChange="sendInfo()">
<%
RegisteredDao rd=new RegisteredDao();
java.util.ArrayList<pp.Doctor> a1=rd.ShowPro();
for(pp.Doctor d:a1)
{
%>
<option><%=d.getDoctorId()%></option>
<%
}
%>
</select>  
<span id="amit"></span>
Date & Time<input type="datetime-local" name="bdaytime">
<input type="submit" value="Book">
</form>  
</pre>
</body>  
</html>  