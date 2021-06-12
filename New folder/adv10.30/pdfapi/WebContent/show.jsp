<%
String pdf=request.getParameter("pdf");
%>
<center>
<%=pdf %>
</center>
<center>
<embed src=<%=pdf %> height="900px" width="600px">
</embed>
</center>