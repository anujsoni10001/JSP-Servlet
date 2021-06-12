import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import firsthibernate.Employee;

//Multiple-Insertion through use of Collection-Framework..//

//ye ek Transaction hai ya to ye pura hoga ya nahee hoga //
//Transactions follows ACID Property//
public class MultiInsert {
public static void main(String[] args)
{
//Configuration cf=new Configuration().configure("hibernate.cfg.xml");
// SessionFactory sf=cf.buildSessionFactory();
//// Session session=sf.openSession(); 
Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();	
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
Employee e4=new Employee();
Employee e5=new Employee();
java.util.ArrayList<Employee> a1=new java.util.ArrayList<Employee>();
a1.add(e1);
a1.add(e2);
a1.add(e3);
a1.add(e4);
a1.add(e5);
for(Employee e:a1)
{
e.setName("Anuj Soni");
e.setSal("dnbh");
e.setDesignation("Project-Manager");
int id=(int)session.save(e);
System.out.println(id+"added...");
}
Transaction t=session.beginTransaction();
t.commit();
session.close();
}
}
