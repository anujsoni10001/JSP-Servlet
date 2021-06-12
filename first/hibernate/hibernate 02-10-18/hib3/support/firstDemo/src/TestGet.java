import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.prodev.entity.Student;

public class TestGet {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
	Query q=session.createQuery("from Student where rollNo=? and name=?");
	q.setInteger(0,11221);
	q.setString(1, "'; SHUTDOWN; -- '");
		List<Student> l=q.list();
		System.out.println(l);
		session.close();
		sf.close();
	}

}
