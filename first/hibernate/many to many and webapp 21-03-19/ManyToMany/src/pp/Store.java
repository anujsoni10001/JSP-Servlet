package pp;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Student s=new Student();
		s.setSid(101);
		s.setSname("chirag");
		Student s1=new Student();
		s1.setSid(102);
		s1.setSname("abhi");
		Course c1=new Course();
		c1.setCid(1);
		c1.setCname("java");
		c1.setDuration("four");
		Course c2=new Course();
		c2.setCid(2);
		c2.setCname("php");
		c2.setDuration("three");
		Set<Course> hs=new HashSet<Course>();
		hs.add(c1);
		hs.add(c2);
		s.setCourses(hs);
		s1.setCourses(hs);
		session.save(s);
		session.save(s1);
		tx.commit();
		session.close();
		System.out.println("done");
	}

}
