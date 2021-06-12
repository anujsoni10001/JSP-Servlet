<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@page import="com.app.entity.Employee"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Configuration cfg=new Configuration();
cfg.configure();
SessionFactory sf=cfg.buildSessionFactory();
//SessionFactory sf=new Configuration().configure().buildSessionFactory()
Session session1=sf.openSession();
Transaction tx=	session1.beginTransaction();
Employee e=new Employee(111,"Praveen",12000,"Indore");
session1.save(e);
tx.commit();
session1.close();
System.out.println("Done");
sf.close();
System.out.println("Emp Id="+e.getEmpId());

%>
</body>
</html>