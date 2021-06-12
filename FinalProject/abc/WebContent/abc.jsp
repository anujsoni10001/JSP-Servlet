<%--Concept of 5 JSP Action Elements--%>
<%--<jsp:include page="#">--%>
<%--Java-include action element--%>
<%
String id=request.getParameter("id");
String pwd=request.getParameter("pwd");
out.println(id);
out.println(pwd);
%>
<jsp:include page="Calc.jsp"></jsp:include>