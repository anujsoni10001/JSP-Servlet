import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Ptrainer;
import pp.Trainer;
import pp.Ttrainer;

public class StoreData {

	public static void main(String[] args) {
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	Trainer t=new Trainer();
	t.setName("shubham");
	Ptrainer t1=new Ptrainer();
	t1.setName("anurag_sir");
	t1.setIntime(10);
	t1.setSal(30000);
	Ttrainer t2=new Ttrainer();
	t2.setName("deepak_sir");
	t2.setBatches(2);
	t2.setAmount(5000);
	session.save(t);
	session.save(t1);
	session.save(t2);
	tx.commit();
	session.close();
	System.out.println("done");
	}

}
