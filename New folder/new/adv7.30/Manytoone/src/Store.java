

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
		t.setName("abhi");
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("anuj");
		s1.setCourse("java");
		Student s2=new Student();
		s2.setSid(2);
		s2.setSname("raj");
		s2.setCourse("php");
		s1.setTname(t);
		s2.setTname(t);
		session.save(s1);
		session.save(s2);
		tx.commit();
		session.close();
		System.out.println("done");
	}

}
