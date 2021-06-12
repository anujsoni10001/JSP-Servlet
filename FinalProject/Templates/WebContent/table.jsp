<%@include file="db.jsp"%>
<%@page errorPage="error.jsp"%>
<%
String sid=null;
%>
<%
sid=request.getParameter("sid");
String qr="select * from apoint where sid=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,sid);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Table V02</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
		<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/utilt.css">
	<link rel="stylesheet" type="text/css" href="css/maint.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
					<div class="table">

						<div class="row header">
							<div class="cell">
								ID
							</div>
							<div class="cell">
								Email	
							</div>
							<div class="cell">
								Date
							</div>
							<div class="cell">
								Time
							</div>
							<div class="cell">
								
							</div>
							<div class="cell">
								
							</div>
							<div class="cell">
								
							</div>
						</div>
						<%
do
{
	String id=rs.getString("id");
	String email=rs.getString("email");
	String date=rs.getString("date");
	String time=rs.getString("time");
	%>

						<div class="row">
							<div class="cell" data-title="Full Name">
								<%=id%>
							</div>
							<div class="cell" data-title="Age">
								<%=email%>
							</div>
							<div class="cell" data-title="Job Title">
								<%=date%>
							</div>
							<div class="cell" data-title="Location">
								<%=time%>
							</div>
							<div class="cell" data-title="Location">
							<a href=conform.jsp?sid=<%=sid%>&id=<%=id%>><button> CONFORM </button></a>
							</div>
							<div class="cell" data-title="Location">
								<a href=Cancel.jsp?sid=<%=sid%>&id=<%=id%>><button> CANCEL </button></a>
							</div>
							<div class="cell" data-title="Location">
								<a href=Deleteap.jsp?sid=<%=sid%>&id=<%=id%>><button> DELETE </button></a>
							</div>
						</div>
						<%
     }while(rs.next());
%>
				</div>
			</div>
		</div>
	</div>
<%
}
else
{
out.println("No Data Found...");
}
%>
<!--===============================================================================================-->	
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="js/maint.js"></script>

</body>
</html>