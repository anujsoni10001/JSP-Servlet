import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Student;
import pp.Trainer;

public class Store {

	public static void main(String[] args) {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Student s=new Student();
		s.setSid(101);
		s.setSname("abhi");
		Trainer t=new Trainer();
		t.setTid(111);
		t.setTname("lala");
		t.setS(s);
		session.save(t);
		tx.commit();
		session.close();
		System.out.print("done");
	}

}
