import java.sql.*;
class JDBC
{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anuj","root");  
String qr="select * from emp";
Statement ps=con.createStatement();
ResultSet rs=ps.executeQuery(qr);
///Pointer intially Point to the Attributes Written in the Table of Database...
if(rs.next())
{
do
{
System.out.println(rs.getInt("id")+rs.getString("name"));
}while(rs.next());
}
else
{
System.out.println("Found No Data....");
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}