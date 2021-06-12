<h1>welcome to admin panel</h1>
<%
String id=(String)session.getAttribute("id");
%>
<%="welcome "+id%>
<form action="add.jsp">
NAME<input type="text" name="name" />
PRICE<input type="text" name="price" />
CAT<input type="text" name="cat" />
CMP<input type="text" name="cmp" />
<input type="submit" value="Add Product">
</form>