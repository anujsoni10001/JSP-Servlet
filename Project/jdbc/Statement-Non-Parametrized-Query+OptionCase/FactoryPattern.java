interface Demo
{
void show();
}
class A implements Demo
{
public void show()
{
System.out.println("Show From A");
}
}
class Dummy
{
public static Demo display(String n)
{
if(n.equals("A"))
{
return new A();
}
return null;
}
}
class Main
{
public static void main(String args[])
{
Demo d=Dummy.display("");
d.show();
}
}