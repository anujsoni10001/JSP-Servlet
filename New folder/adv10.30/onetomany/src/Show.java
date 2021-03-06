import java.util.List;

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
			List<Student> al1=t.getStudents();
			for(Student s:al1)
			{
				System.out.println(s.getId()+" "+s.getSname()+" "+s.getCourse());
			}
		}
		session.close();
	}

}
