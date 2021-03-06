import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Student;
import pp.Trainer;

public class Show {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		/*Student s=(Student) session.load(Student.class, new Integer(2));
		System.out.println(s.getSid()+" "+s.getSname()+" "+s.getCourse());
		Trainer t=s.getTname();
		System.out.println(t.getId()+" "+t.getName());
		*/
		Query qr=session.createQuery("from Student");
		List<Student> al=qr.list();
		for(Student s:al)
		{
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getCourse());
			Trainer t=s.getTname();
			System.out.println(t.getId()+" "+t.getName());
		}
		session.close();

	}

}
