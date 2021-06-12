<%@page errorPage="error.jsp"%>
<%--//Here we use out,request implict object provided by JSP
//JSP(Java Server Page)--%>
<%
String n1=request.getParameter("n1");
String n2=request.getParameter("n2");
String c=request.getParameter("b");
int a=Integer.parseInt(n1);
int b=Integer.parseInt(n2);
switch(c)
{
case "ADD":out.println(a+b);
	       break;
case "SUB":out.println(a-b);
	       break;
case "DIV":out.println(a/b);
	       break;
case "MUL":out.println(a*b);
	       break;
}
%>
