import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Emp;

public class ShowByMethod {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		//Emp e=(Emp) session.load(Emp.class, new Integer(102));
		//System.out.println(e.getId()+" "+e.getName());
		Emp e=(Emp) session.get(Emp.class, new Integer(102));
		//System.out.println(e.getId()+" "+e.getName());
		System.out.println(e);
		session.close();
	}

}
