interface Connection 
{
public Statement createStatement();
}
interface Statement
{
public int executeUpdate(String n);
}
class X implements Connection,Statement
{
public Statement createStatement()
{
System.out.println("Show from Connection Interface");
return new X();
}
public int executeUpdate(String n)
{
if(n.equals("anuj"))
{
return 1;
}
return 0;
}
}
class DriverManager 
{
public static Connection display(String n)
{
if(n.equals("A"))
{
return new X();
}
return null;
}
public static Statement display1(String n)
{
if(n.equals("B"))
{
return new X();
}
return null;
}
}
class Main
{
public static void main(String args[])
{
Connection con=DriverManager.display("A");
Statement st=con.createStatement();
int i=st.executeUpdate("a");
System.out.println(i);
}
}