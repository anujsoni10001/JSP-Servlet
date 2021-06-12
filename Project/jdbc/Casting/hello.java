class A
{
void m1()
{
System.out.println("m1 from class A");
}
}
class B extends A
{
void m2()
{
System.out.println("m2 from class B");
}
}
class C extends B
{
void m3()
{
System.out.println("m3 from class C");
}
}
class Demo
{
public static void main(String[] args) {
Object a1=new C();//Upcasting 
C c1=(C)a1; //Downcsting 
c1.hashCode();
}
}