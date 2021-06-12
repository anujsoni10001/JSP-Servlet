import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//ye ek Transaction hai ya to ye pura hoga ya nahee hoga //
//Transactions follows ACID Property//
public class Addrecord {
public static void main(String[] args)
{
//Configuration cf=new Configuration().configure("hibernate.cfg.xml");
// SessionFactory sf=cf.buildSessionFactory();
//// Session session=sf.openSession(); 
Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();	
firsthibernate.Employee emp=new firsthibernate.Employee();
emp.setId(50);
emp.setName("Anuj Soni");
emp.setSal("dnbh");
emp.setDesignation("Project-Manager");
int id=(int)session.save(emp); ///Persistent Object///
Transaction t=session.beginTransaction();
t.commit();
System.out.println(id+"added...");
session.close();
}
}
