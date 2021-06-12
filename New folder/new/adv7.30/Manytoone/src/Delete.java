import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Student;

public class Delete {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("anuj");
		s1.setCourse("java");
		session.delete(s1);
		tx.commit();
		System.out.println("done");
	}

}
