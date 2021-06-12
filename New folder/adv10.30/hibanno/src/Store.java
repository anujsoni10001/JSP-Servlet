import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import pp.Emp;

public class Store {

	public static void main(String[] args) {
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Emp e=new Emp(111,"veer");
		session.persist(e);
		tx.commit();
		System.out.println("added");
		session.close();
	}

}
