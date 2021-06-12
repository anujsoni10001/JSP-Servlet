import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Student;
import pp.Trainer;

public class Show {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Trainer");
		List<Trainer> al=qr.list();
		for(Trainer t:al)
		{
			System.out.println(t.getId()+" "+t.getName());
			Set<Student> st=t.getStudents();
			for(Student s:st)
			{
				System.out.println(s.getSid()+" "+s.getSname()+" "+s.getCourse());
			}
		}
		session.close();
	}

}
