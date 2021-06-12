import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Emp;

public class StoreEmp {

	public static void main(String[] args) {
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	Emp e=new Emp();
	e.setId(101);
	e.setName("raj");
	session.save(e);
	tx.commit();
	session.close();
	System.out.println("done");
	}

}
