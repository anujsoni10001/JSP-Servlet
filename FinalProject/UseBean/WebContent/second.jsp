<%--///Concept of Java Use Bean Class
Java 5 Action Element 
Java Use Bean --%>
///Here i is the Object of the BeanClass///
<jsp:useBean id="i" class="pp.BeanClass"></jsp:useBean>
<jsp:setProperty property="*" name="i"/>
<jsp:getProperty property="name" name="i"/>
<jsp:getProperty property="city" name="i"/>
<jsp:getProperty property="number" name="i"/>