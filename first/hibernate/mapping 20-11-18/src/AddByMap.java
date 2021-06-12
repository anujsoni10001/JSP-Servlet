import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Manager;

public class AddByMap {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Manager m=new Manager();
		m.setName("abhi");
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("first", "abc");
		hm.put("second", "pqr");
		hm.put("third", "xyz");
		m.setEmps(hm);
		Manager m1=new Manager();
		m1.setName("lala");
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("first", "raj");
		hm1.put("second", "yuvraj");
		m1.setEmps(hm1);
		session.save(m);
		session.save(m1);
		tx.commit();
		System.out.println("done");
		session.close();
	}

}
