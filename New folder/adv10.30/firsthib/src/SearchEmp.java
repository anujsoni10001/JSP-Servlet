import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Employee;

public class SearchEmp {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		//Employee e=(Employee) session.load(Employee.class, new Integer(115));
		Employee e=(Employee) session.get(Employee.class, new Integer(115));
		System.out.println(e);
		//System.out.println(e.getId()+" "+e.getName()+" "+e.getJob());
		session.close();
	}

}
