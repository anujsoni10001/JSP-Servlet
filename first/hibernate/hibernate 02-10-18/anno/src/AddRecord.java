import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import pp.Employee;

public class AddRecord {

	public static void main(String[] args) {
	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	Employee e=new Employee();
	e.setId(114);
	e.setName("rajababu");
	//session.save(e);
	session.saveOrUpdate(e);
	tx.commit();
	System.out.println("done");
	session.close();
	}

}
