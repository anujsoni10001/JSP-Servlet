import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Employee;

public class AddRecord {

	public static void main(String[] args) {
		Configuration cf=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		Employee e=new Employee();
		Employee e1=new Employee();
		Employee e2=new Employee();
		e.setName("rajveer");
		e1.setName("lala");
		e2.setName("abhi");
		session.persist(e);
		session.persist(e1);
		session.persist(e2);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println("deleted");
		session.clear();
		session.close();
	}

}
