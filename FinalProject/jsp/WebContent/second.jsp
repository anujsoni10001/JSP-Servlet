<%--///Concept of Java Use Bean Class
Java 5 Action Element 
Java Use Bean --%>
<jsp:useBean id="i" class="pp.Product"></jsp:useBean>
<jsp:setProperty property="*" name="i"/>
<jsp:getProperty property="cat" name="i"/>