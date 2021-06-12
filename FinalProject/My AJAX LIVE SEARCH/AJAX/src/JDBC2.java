import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class JDBC2
{
public static void main(String b[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","anuj","root");  
String qr="insert into emp values(?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setInt(1,3);
ps.setString(2,"archit");
ps.setInt(3,30);
int i=ps.executeUpdate();
if(i!=0)
{
System.out.println(i+"Record Inserted Succesfully..");
}
else
{
System.out.println("Record Not Inserted Succesfully..");
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}