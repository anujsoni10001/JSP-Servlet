import java.sql.*;
//Mujhe Scanner Class Import Nahi Krna Pr Phir Bhi Scanner Class Ko Use krna hai
class A
{
public static void main(String args[])
{
int j=0;
try
{
System.out.println("************Multi-Inserting Mode with Same Program***************");
//Use Kiya Bina Scanner Class Ko Use Krke
System.out.println("How many Time you want to Insert");
java.util.Scanner sc=new java.util.Scanner(System.in);  
//ni = number of insertion 
int ni=sc.nextInt();
Class.forName("com.mysql.cj.jdbc.Driver");
//Driver Loaded / Load the Gun 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj","root","root");
//Connection Established /Nisana Lagana 
Statement st=con.createStatement();
//Statement ko Load krna takki gun fire krne par bullet nikle
System.out.println("Enter the Name to be Inserted");
for(int i=1;i<=ni;i++)
{
String user=sc.next();
j=j+st.executeUpdate("insert into student values('"+user+"')");
}
if(j!=0)
{
System.out.println(j+"Record Inserted Succesfully.....");
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