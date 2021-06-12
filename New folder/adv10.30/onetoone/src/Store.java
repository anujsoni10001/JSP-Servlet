import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Address;
import pp.Emp;

public class Store {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Emp e=new Emp();
		e.setId(101);
		e.setName("raj");
		Address a=new Address();
		a.setHno(101);
		a.setCity("indore");
		a.setEmployee(e);
		e.setAddress(a);
		session.save(e);
		tx.commit();
		session.close();
		System.out.println("done");
	}

}
