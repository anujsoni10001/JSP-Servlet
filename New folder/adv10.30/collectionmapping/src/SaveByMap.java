import java.util.LinkedHashMap;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Trainer3;

public class SaveByMap {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Trainer3 t=new Trainer3();
		t.setName("lala");
		LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
		hm.put("first", "rahul");
		hm.put("second", "ajay");
		t.setSname(hm);
		Trainer3 t1=new Trainer3();
		t1.setName("abhi");
		LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
		hm1.put("one", "aaa");
		hm1.put("two", "bbb");
		t1.setSname(hm1);
		session.save(t);
		session.save(t1);
		tx.commit();
		session.close();
		System.out.println("done");
	}

}
