import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Employee;

public class Show {

	public static void main(String[] args) {
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Query qr=session.createQuery("from Employee");
		List<Employee> al=qr.list();
		for(Employee e:al)
		{
			System.out.println(e.getId()+"  "+e.getName());
		}
		session.close();
	}

}
