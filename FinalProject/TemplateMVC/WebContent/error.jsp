<%--This is my First JSP Comments--%>
<%--Use of the Exception implicit object provided by the jsp--
Exception is handled by Transferring the Exception/Error Object into another Error Page 
--%>
<%@page isErrorPage="true"%>
<h1>Something Went Wrong....!!!!</h1>
<%=exception%>