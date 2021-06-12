import java.sql.*;
import java.util.Scanner;
class A
{
public static void main(String args[])
{
try
{
System.out.println("************Enter the Characters To be Updated into DB***************");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the ID Number which is to be Updated");
int id=sc.nextInt();
System.out.println("Enter the Name");  
String name=sc.next();
Class.forName("com.mysql.cj.jdbc.Driver");
//Driver Loaded / Load the Gun 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
//Connection Established /Nisana Lagana 
String qr="update Emp set name=? where id=?";
PreparedStatement ps=con.prepareStatement(qr);
//Statement ko Load krna takki gun fire krne par bullet nikle
ps.setInt(2,id);
ps.setString(1,name);
int i=ps.executeUpdate();
if(i!=0)
{
System.out.println("Record Updated Succesfully.....");
}
else
{
System.out.println("Record Not Updated .....");
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}