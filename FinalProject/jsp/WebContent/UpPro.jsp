<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product Page</title>
</head>
<body>
<form action="UpProAll.jsp">
<h3>Update All by ID (One by One)</h3>
<pre>
Enter the Product ID<input type="text" name="id">
Enter the Name: <input type="text" name="Name">
Enter the Price: <input type="text" name="Price">
Enter the Category: <input type="text" name="Category"> 
Enter the Company: <input type="text" name="Company">
<input type="submit" value="byidAll">
</pre>
</form>
                             OR


<form action="UpPro">
<h3>Update by ID (One by One)</h3>
<pre>
Enter the Product ID<input type="text" name="id">
Select the Update Categories  <select name="Category">
<option>Name</option>
<option>Price</option>
<option>Category</option>
<option>Company</option>
</select>
Enter the Required Info. <input type="text" name="catuval">
<input type="submit" value="byid" name="b">
</pre>
</form>

                              OR
<form action="UpProbyname">  
<h3>Update by Product Name(One by One)</h3>
<pre>                     
Enter the Product Name<input type="text" name="name">
Select the Update Categories  <select name="cat">
<option>id</option>
<option>Price</option>
<option>Category</option>
<option>Company</option>
</select>
Enter the Required Info. <input type="text" name="catuval">
<input type="submit" value="byName" name="b">
</pre>
</form>                                     
</body>