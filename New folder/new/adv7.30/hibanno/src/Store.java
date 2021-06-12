import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import pp.Emp;

public class Store {

	public static void main(String[] args) {
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Emp e=new Emp();
		e.setId(102);
		e.setName("abc1");
		e.setJob("dba");
		session.persist(e);
		tx.commit();
		session.close();
		System.out.println("done");

	}

}
