import java.sql.*;
class Demo
{
public static void main(String[] args)
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
////Non-Parametrized Query...
java.util.Scanner sc=new java.util.Scanner(System.in);
String name=sc.next();
String qr="select * from Emp where name=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1,name);
ResultSet rs=ps.executeQuery();
///Pointer intially Point to the Attributes Written in the Table of Database...
if(rs.next())
{
do
{
///System.out.println(rs.getInt(2)+"||"+rs.getString(1));
//Overrided Method 
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