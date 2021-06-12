<%@include file="db.jsp"%>
<%@page errorPage="error.jsp"%>
<%
String qr="select * from addser";
PreparedStatement ps=con.prepareStatement(qr);
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
do
{
	String id=rs.getString("id");
	String tyservice=rs.getString("tyservice");
	String Location=rs.getString("Location");
	String mnumber=rs.getString("mnumber");
	String t=rs.getString("t");
	String t1=rs.getString("t1");
	String a=rs.getString("a");
	String sid=rs.getString("sid");
	String date=rs.getString("date");
	String remarks=rs.getString("remarks");
	%>

						<div class="row">
							<div class="cell" data-title="Full Name">
								<%=id%>
							</div>
							<div class="cell" data-title="Age">
								<%=tyservice%>
							</div>
							<div class="cell" data-title="Job Title">
								<%=Location%>
							</div>
							<div class="cell" data-title="Location">
								<%=mnumber%>
							</div>
							<div class="cell" data-title="Location">
								<%=t%>
							</div>
							<div class="cell" data-title="Location">
								<%=t1%>
							</div>
							<div class="cell" data-title="Location">
								<%=a%>
							</div>
							<div class="cell" data-title="Location">
								<%=date%>
							</div>
							<div class="cell" data-title="Location">
								<%=remarks%>
							</div>
							<div class="cell">
							<a href=b.jsp?id=<%=id%>&sid=<%=sid%>><button>BOOK</button></a>
							</div>
							<div class="cell">
							<a href=gets.jsp?id=<%=id%>><button>GET-STATUS</button></a>
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