///DML means insert ,update and Delete 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class Demo
{
public static void main(String b[])
{
String name,user="a";
int id,i;
boolean q=true;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
java.util.Scanner sc=new java.util.Scanner(System.in);
do
{
System.out.println("*******************************************");
System.out.println("****************DML-Window*****************");
System.out.println("**************Enter Your Choice************");
System.out.println("******Press 'i' for Insertion Operation****");
System.out.println("******Press 'u' for Updation Operation*****");
System.out.println("******Press 'd' for Deletion Operation*****");
System.out.println("******OR else Press 'e' for Exit **********");
user=sc.next();
switch(user)
{
case "i":System.out.println("***********WELCOME TO INSERTION-WINDOW**************");
         String in="insert into Emp values(?,?)";
         PreparedStatement psi=con.prepareStatement(in);
         System.out.println("*******Enter the ID and NAME to be Inserted*********");
         System.out.println("*****************Enter the ID First **********************");
         id=sc.nextInt();
         System.out.println("***************Enter the NAME*****************");
         name=sc.next();
         psi.setInt(1,id);
         psi.setString(2,name);
         i=psi.executeUpdate();
         if(i!=0)
         {
         System.out.println(i+"Record Inserted Succesfully..");
         }
         else
         {
         System.out.println("Record Not Inserted Succesfully..");
         }
         break;
case "u":System.out.println("***********WELCOME TO UPDATION-WINDOW**************");
         String u="update Emp set name=? where id=?";
         PreparedStatement psu=con.prepareStatement(u);
         System.out.println("Enter the ID Number which is to be Updated");
         System.out.println("*****************Enter the ID First **********************");
         id=sc.nextInt();
         System.out.println("***************Enter the NAME*****************");
         name=sc.next();
         psu.setInt(2,id);
         psu.setString(1,name);
         i=psu.executeUpdate();
         if(i!=0)
         {
         System.out.println(i+"Record Updated Succesfully..");
         }
         else
         {
         System.out.println("Record Not Updated Succesfully..");
         }
         break;
case "d":System.out.println("***********WELCOME TO DELETION-WINDOW**************");
         String d="delete from Emp where id=?";
         PreparedStatement psd=con.prepareStatement(d);
         System.out.println("Enter the ID Number which row is to be Deleted");
         System.out.println("*****************Enter the ID**********************");
         id=sc.nextInt();
         psd.setInt(1,id);
         i=psd.executeUpdate();
         if(i!=0)
         {
         System.out.println(i+"Record Deleted Succesfully..");
         }
         else
         {
         System.out.println("Record Not Deleted Succesfully..");
         }
         break;
case "e":q=false;
         break;
}
}while(q);
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}