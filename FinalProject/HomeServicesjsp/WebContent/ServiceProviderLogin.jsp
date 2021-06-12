<!DOCTYPE html>
<html>
<head>
<title>Login and Registration Page</title>
<link rel="stylesheet" type="text/css" href="user.css">
<script>
window.location.hash="no-back-button";
window.location.hash="Again-No-back-button";//again because google chrome don't insert first hash into history
window.onhashchange=function(){window.location.hash="no-back-button";}
</script> 
</head>
<body>
<h3>Welcome to Service Provider Login Page</h3>
<div class="LoginPage">
<div class="Form">
<form class="login-form" action="SPlogin.jsp">
<input type="text" name="sid" placeholder="S-ID">
<input type="password" name="pwd" placeholder="Password">
<button type="submit">Login</button>
</form>
</div>
</div>
</body>
</html>