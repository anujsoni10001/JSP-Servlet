///DML means insert ,update,select and Delete /// 
///Remember this in java.lang.String ///
///  public int compareTo(String anotherString) 
///  public boolean equals(Object anotherObject)  
import java.sql.*;
class A
{
String name;
int id,i;
java.util.Scanner sc=new java.util.Scanner(System.in);
void insertion()
{
	     try
	     {
	     Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
         System.out.println("***********WELCOME TO INSERTION-WINDOW**************");
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
         }
         catch(Exception e)
         {
         System.out.println(e);
         }
}
void update()
{       
	     try
	     {
	     Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
         System.out.println("***********WELCOME TO UPDATION-WINDOW**************");
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
         }
         catch(Exception e)
         {
         System.out.println(e);
         }
}
void delete()
{
         try
         {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
         System.out.println("***********WELCOME TO DELETION-WINDOW**************");
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
         }
         catch(Exception e)
         {
         System.out.println(e);
         }
}
void select()
{
	     try
	     {
	     Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
         System.out.println("***********WELCOME TO FETCH-WINDOW**************");
         ///Parametrized Queries 
         String s="select * from Emp where id=?";
         PreparedStatement pss=con.prepareStatement(s);
         System.out.println("Enter the ID Number whose details is to be Fetched");
         System.out.println("*****************Enter the ID**********************");
         id=sc.nextInt();
         pss.setInt(1,id);
         ResultSet rss=pss.executeQuery();
         if(rss.next())
         {
         do
         {
         ///System.out.println(rs.getInt(2)+"||"+rs.getString(1));
         //Overrided Method 
         System.out.println(rss.getInt("id")+rss.getString("name"));
         }while(rss.next());
         }
         else
         {
         System.out.println("Found No Data....");
         }
         }
         catch(Exception e)
         {
         System.out.println(e);
         }
}
void selecta()
{
	      try
	      {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	      System.out.println("***********WELCOME TO FETCH ALL-WINDOW**************");
          ///Non-Parametrized Queries 
          String sm="select * from Emp";
          Statement stsm=con.createStatement();
          ResultSet rssm=stsm.executeQuery(sm);
          if(rssm.next())
          {
          do
          {
          System.out.println(rssm.getInt("id")+"||"+rssm.getString("name"));
          }while(rssm.next());
          }
          else
          {
          System.out.println("Data Not Found.....");
          }
          }
          catch(Exception e)
          {
          System.out.println(e);
          }
}
void selectad()
{
	      try
	      {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	      System.out.println("*******WELCOME TO FETCH ALL-WINDOW DESCENDING ORDER******");
          ///Non-Parametrized Queries 
          String sm="select * from Emp order by id desc,name desc";
          Statement stsm=con.createStatement();
          ResultSet rssm=stsm.executeQuery(sm);
          if(rssm.next())
          {
          do
          {
          System.out.println(rssm.getInt("id")+"||"+rssm.getString("name"));
          }while(rssm.next());
          }
          else
          {
          System.out.println("Data Not Found.....");
          }
          }
          catch(Exception e)
          {
          System.out.println(e);
          }
}
void selectaa()
{
	      try
	      {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anuj1","root","root");
	       System.out.println("*******WELCOME TO FETCH ALL-WINDOW ASCENDING ORDER******");
          ///Non-Parametrized Queries 
          String sm="select * from Emp order by id,name";
          Statement stsm=con.createStatement();
          ResultSet rssm=stsm.executeQuery(sm);
          if(rssm.next())
          {
          do
          {
          System.out.println(rssm.getInt("id")+"||"+rssm.getString("name"));
          }while(rssm.next());
          }
          else
          {
          System.out.println("Data Not Found.....");
          }
          }
          catch(Exception e)
          {
          System.out.println(e);
          }
}
void loop()
{
System.out.println("*******************************************");
System.out.println("****************DML-Window*****************");
System.out.println("**************Enter Your Choice************");
System.out.println("******Press 'i' for Insertion Operation****");
System.out.println("******Press 'u' for Updation Operation*****");
System.out.println("******Press 'd' for Deletion Operation*****");
System.out.println("******Press 's' for Selection Operation****");
System.out.println("***Press 'sa' for Selection All Operation**"); 
System.out.println("Press 'sad' for Selection All by desc order");
System.out.println(" Press 'saa' for Selection All by asc order"); 
System.out.println("******Press 'e' for Exit Operation*********"); 
String v=sc.next();
switch(v)
{
case "i":insertion();
         break;
case "u":update();
         break;
case "d":delete();
         break;
case "s":select();
         break;
case "sa":selecta();
         break;
case "sad":selectad();
         break;
case "saa":selectaa();
         break;
case "e":System.exit(0);
         break;
default:System.out.println("Wrong Choice....!!!!!");
}
System.out.println("Press 'c' for Continue Operation else exit");
v=sc.next();
if(v.equals("c"))
{
loop();
}
else
{
System.exit(0);
}
}
}
class Main
{
public static void main(String[] args) 
{
A a1=new A();
a1.loop();
}
}