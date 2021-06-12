public class Product
{
private int id;
private int price;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public void setPrice(int price)
{
this.price=price;
}
public String getName()
{
return name;
}
public int getId()
{
return id;
}
public int getPrice()
{
return price;
}
}
class Demo
{
public static void main(String[] dd)
{
Product p1=new Product();
p1.setName("Anuj");
System.out.println(p1.getName());
}
}