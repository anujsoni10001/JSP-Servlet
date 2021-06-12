import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Student;
import pp.Trainer;

public class Store {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Trainer t=new Trainer();
		t.setId(101);
		t.setName("ajay");
		Student s=new Student();
		s.setSid(1);
		s.setSname("aaa");
		Student s1=new Student();
		s1.setSid(2);
		s1.setSname("bbb");
		s.setTr(t);
		s1.setTr(t);
		session.save(s);
		session.save(s1);
		tx.commit();
		session.close();
System.out.println("done");
	}

}
