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
String qr="select * from Emp";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(qr);
///Pointer intially Point to the Attributes Written in the Table of Database...
if(rs.next())
{
do
{
///System.out.println(rs.getInt(2)+"||"+rs.getString(1));
//Overrided Method 
System.out.println(rs.getString("name"));
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