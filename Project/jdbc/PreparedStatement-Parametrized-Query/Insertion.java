import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class Demo
{
public static void main(String b[])
{
try
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("*********************************");
System.out.println("********Insertion-Window*********");
System.out.println("*********************************");
System.out.println("Enter the ID");
int id=sc.nextInt();
System.out.println("Enter the Name");
String name=sc.next();
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
String qr="insert into Emp values(?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setInt(1,id);
ps.setString(2,name);
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