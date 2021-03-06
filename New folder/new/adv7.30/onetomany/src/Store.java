import java.util.LinkedHashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Student;
import pp.Trainer;

public class Store {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("anuj");
		s1.setCourse("java");
		Student s2=new Student();
		s2.setSid(102);
		s2.setSname("bachcha");
		s2.setCourse("hibernate");
		Student s3=new Student();
		s3.setSid(103);
		s3.setSname("mota");
		s3.setCourse("spring");
		Trainer t=new Trainer();
		t.setId(201);
		t.setName("abhi");
		LinkedHashSet<Student> hs=new LinkedHashSet<Student>();
	hs.add(s1);
	hs.add(s2);
	hs.add(s3);
	t.setStudents(hs);
	session.save(t);
	//session.delete(t);
		tx.commit();
		session.close();
		System.out.println("done");
	}

}
