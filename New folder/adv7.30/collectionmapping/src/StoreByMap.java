import java.util.LinkedHashMap;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Trainer3;

public class StoreByMap {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Trainer3 t=new Trainer3();
		t.setTid(101);
		t.setName("rahul");
		LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
		hm.put("first", "aaa");
		hm.put("second", "bbb");
		hm.put("third", "ccc");
		t.setStudents(hm);
		Trainer3 t1=new Trainer3();
		t1.setTid(102);
		t1.setName("rahulji");
		LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
		hm1.put("first", "aaa");
		hm1.put("second", "bbb");
		hm1.put("third", "ccc");
		t1.setStudents(hm1);
		session.save(t);
		session.save(t1);
		tx.commit();
		session.close();
		System.out.println("done");
	}

}
