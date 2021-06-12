<%@page import="pp.addser"%>
<%@page import="pp.RegisteredDao"%>
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
								Type of Service
							</div>
							<div class="cell">
								Location
							</div>
							<div class="cell">
								Mobile Number
							</div>
							<div class="cell">
							 Time(to)
							</div>
							<div class="cell">
							Time(From)	
							</div>
							<div class="cell">
							Days Available	
							</div>
							<div class="cell">
							Date
							</div>
							<div class="cell">
							Remarks	
							</div>
							<div class="cell">
								
							</div>
							<div class="cell">
								
							</div>
						</div>
<%
RegisteredDao rd=new RegisteredDao();
java.util.ArrayList<addser> a1=rd.ShowService();
for(addser p:a1)
{
%>
<div class="row">
							<div class="cell" data-title="Full Name">
								<%=p.getId()%>
							</div>
							<div class="cell" data-title="Age">
								<%=p.getTyservice()%>
							</div>
							<div class="cell" data-title="Job Title">
								<%=p.getLocation()%>
							</div>
							<div class="cell" data-title="Location">
								<%=p.getMnumber()%>
							</div>
							<div class="cell" data-title="Location">
								<%=p.getT()%>
							</div>
							<div class="cell" data-title="Location">
								<%=p.getT1()%>
							</div>
							<div class="cell" data-title="Location">
								<%=p.getA()%>
							</div>
							<div class="cell" data-title="Location">
								<%=p.getDate()%>
							</div>
							<div class="cell" data-title="Location">
								<%=p.getRemarks()%>
							</div>
							<div class="cell">
							<a href=b.jsp?id=<%=p.getId()%>&sid=<%=p.getSid()%>><button>BOOK</button></a>
							</div>
							<div class="cell">
							<a href=gets.jsp?id=<%=p.getId()%>><button>GET-STATUS</button></a>
							</div>
							<div class="cell">
							<a href=#><button>DELETE</button></a>
							</div>
						</div>
<%
}
%>
</div>
			</div>
		</div>
	</div>
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