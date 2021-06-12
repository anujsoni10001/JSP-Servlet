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
System.out.println("Enter the Name");  
String anuj=sc.nextLine();
System.out.println("Enter the ID");
String id=sc.nextLine();
Class.forName("com.mysql.cj.jdbc.Driver");
//Driver Loaded / Load the Gun 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj","root","root");
//Connection Established /Nisana Lagana 
Statement st=con.createStatement();
//Statement ko Load krna takki gun fire krne par bullet nikle
int i=st.executeUpdate("update student set name='"+anuj+"' where id ='"+id+"'");
if(i!=0)
{
System.out.println("Record Inserted Succesfully.....");
}
else
{
System.out.println("Record Not Inserted .....");
}
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}