import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Employee;

public class Pagination {

	public static void main(String[] args) {
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Query qr=session.createQuery("From Employee");
	qr.setFirstResult(0);
	qr.setMaxResults(5);
	List<Employee> al=qr.list();
	int i=al.size();
	for(Employee e:al)
	{
		System.out.println(e.getId()+"  "+e.getName());
	
	}
	System.out.println(i);
	session.close();
	}

}
