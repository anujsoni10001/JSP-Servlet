import java.sql.*;
import java.util.Scanner;
class A
{
public static void main(String args[])
{
try
{
System.out.println("************Deletion-Window***************");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the ID Number which is to be Deleted");
int id=sc.nextInt();
Class.forName("com.mysql.cj.jdbc.Driver");
//Driver Loaded / Load the Gun 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
//Connection Established /Nisana Lagana 
String qr="delete from Emp where id=?";
PreparedStatement ps=con.prepareStatement(qr);
//Statement ko Load krna takki gun fire krne par bullet nikle
ps.setInt(1,id);
int i=ps.executeUpdate();
if(i!=0)
{
System.out.println("Record Deleted Succesfully.....");
}
else
{
System.out.println("Record Not Deleted .....");
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}