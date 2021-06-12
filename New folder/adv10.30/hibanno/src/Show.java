import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

import pp.Emp;

public class Show {

	public static void main(String[] args) {
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Emp");
		List<Emp> al=qr.list();
		for(Emp e:al)
		{
			System.out.println(e.getId()+" "+e.getName());
			
		}
		session.close();

	}

}
