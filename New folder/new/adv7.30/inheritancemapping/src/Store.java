import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Permanent;
import pp.Temp;
import pp.Trainer;

public class Store {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Trainer t1=new Trainer();
		t1.setId(101);
		t1.setName("raj");
		Temp t2=new Temp();
		t2.setId(102);
		t2.setName("lala");
		t2.setBatches(4);
		t2.setAmount(10000);
		Permanent p=new Permanent();
		p.setId(103);
		p.setName("abhi");
		p.setSal(25000);
		p.setBonus(5000);
		session.save(t1);
		session.save(t2);
		session.save(p);
		tx.commit();
		session.close();
		System.out.println("done");
	}

}
