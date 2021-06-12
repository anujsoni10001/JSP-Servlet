<%
RequestDispatcher rd=request.getRequestDispatcher("User.jsp");
rd.include(request,response);
%>
<!DOCTYPE html>
<html>
<head>
<title>Login and Registration Page</title>
<link rel="stylesheet" type="text/css" href="user.css">
</head>
<body>
<form>
<input type="text" name="id" placeholder="Email-ID">
                         OR
<input type="password" name="pwd" placeholder="Password">
<button type="submit"></button>
</form>
</body>
</html>