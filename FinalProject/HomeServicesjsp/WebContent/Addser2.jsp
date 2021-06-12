<%
String sid=(String)session.getAttribute("sid");
%>
<!DOCTYPE html>
<html>
<head>
<script>
window.location.hash="no-back-button";
window.location.hash="Again-No-back-button";//again because google chrome don't insert first hash into history
window.onhashchange=function(){window.location.hash="no-back-button";}
</script> 
<title>Add Service Page</title>
<link rel="stylesheet" type="text/css" href="style1.css">
</head>
<body>
<h3>Welcome to Add Service Page</h3>
<div class="Addser">
<div class="Form">
<form action="Addser.jsp" method="post">
<input type="hidden" name="sid" value=<%=sid%>>
<input class="p" type="text" name="id" placeholder="Unique ID of Service">
<p class="message">Select the Type of Service</p>
<select name="tyservice">
<option>House Painting</option>
<option>Tailor</option>
<option>Personal Chef</option>
<option>Computer Repair</option>
<option>Catering</option>
<option>Car/Bike Mechanic</option>
<option>MP Online</option>
</select>
<input class="p" type="text" name="Location" placeholder="Location">
<input class="p" type="text" name="mnumber" placeholder="Service Provider Mobile Number">
<p class="message">Enter the Time</p>
<input class="p" type="time" name="t" placeholder="Working-Hours-To"> 
<p class="message">To</p>
<input class="p" type="time" name="t1" placeholder="Working-Hours-From">
<p class="message">Enter the Working Days :-</p>
<input type="checkbox" name="a" value="Sun">Sunday
<input type="checkbox" name="a" value="Mon" checked>Monday
<input type="checkbox" name="a" value="Tue">Tuesday
<input type="checkbox" name="a" value="Wed">Wednesday
<input type="checkbox" name="a" value="Thu">Thursday
<input type="checkbox" name="a" value="Fri">Friday
<input type="checkbox" name="a" value="Sat">Saturday
<button type="submit">AddService</button>
</form>
</div>
</div>
</body>
</html>