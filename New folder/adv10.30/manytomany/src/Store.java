import java.util.HashSet;
import java.util.Set;

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
		t.setTid(103);
		t.setTname("abhi");
		Trainer t1=new Trainer();
		t1.setTid(104);
		t1.setTname("lala");
		Student s=new Student();
		s.setSid(113);
		s.setSname("aaa");
		Student s1=new Student();
		s1.setSid(114);
		s1.setSname("bbb");
		Set st=new HashSet();
		st.add(s);
		st.add(s1);
		t.setStudents(st);
		t1.setStudents(st);
		session.save(t);
		session.save(t1);
		tx.commit();
		session.close();
		System.out.println("done");
	}

}
