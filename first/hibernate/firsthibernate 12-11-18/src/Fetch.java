import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Employee;

public class Fetch {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Employee e=(Employee) session.get(Employee.class, new Integer(10));
		//System.out.println(e);
		if(e==null)
		{
			System.out.println("no records found");
		}
		else
		{
			System.out.println(e.getName());
		}
		session.close();
		
	}

}
