package pp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ShowAllRecords {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Employee");
		qr.setFirstResult(0);
		qr.setMaxResults(5);
		List<Employee> al=qr.list();
		for(Employee e:al)
		{
			System.out.println(e);
		}
		session.close();
	}

}
