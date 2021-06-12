import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
public static void main(String[] args)
{
Configuration cf=new Configuration().configure("hibernate.cfg.xml");
SessionFactory sf=cf.buildSessionFactory();
Session session=sf.openSession();
firsthibernate.Employee emp=new firsthibernate.Employee();
emp.setId(387);
emp.setName("Esha Soni");
emp.setSal("dnbh");
emp.setDesignation("Project-Manager");
session.update(emp);///Persistent Object///
Transaction t=session.beginTransaction();
t.commit();
session.close();
}
}
