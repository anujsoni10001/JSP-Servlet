import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.entity.Employee;

public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		//SessionFactory sf=new Configuration().configure().buildSessionFactory()
		Session session=sf.openSession();
		Transaction tx=	session.beginTransaction();
		Employee e=new Employee(111,"Ramesh",12000,"Indore");
		session.save(e);
		tx.commit();
		session.close();
		System.out.println("Done");
		sf.close();
		System.out.println("Emp Id="+e.getEmpId());
	}

}
