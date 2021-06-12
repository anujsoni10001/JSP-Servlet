<%@page import="org.hibernate.cfg.*" %>
<%@page import="org.hibernate.*" %>
<jsp:useBean id="i" class="pp.Emp"></jsp:useBean>
<jsp:setProperty property="*" name="i"/>
<%
Session se=new Configuration().configure().buildSessionFactory().openSession();
Transaction tx=se.beginTransaction();
se.save(i);
tx.commit();
se.close();
%>
<%="added sucessfully"%>