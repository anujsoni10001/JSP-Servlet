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
		e.setId(111);
		e.setName("veer");
		int id=(int) session.save(e);
		Transaction tx=session.beginTransaction();
		tx.commit();
		System.out.println(id+" added");
		session.close();
	}

}
