import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//ye ek Transaction hai ya to ye pura hoga ya nahee hoga //
//Transactions follows ACID Property//
public class Delete {
public static void main(String[] args)
{
Configuration cf=new Configuration().configure("hibernate.cfg.xml");
SessionFactory sf=cf.buildSessionFactory();
Session session=sf.openSession();
firsthibernate.Employee emp=new firsthibernate.Employee();
emp.setId(37);
session.delete(emp); ///Persistent Object///
Transaction t=session.beginTransaction();
t.commit();
session.close();
}
}
