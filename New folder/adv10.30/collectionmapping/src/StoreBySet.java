

import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Trainer1;

public class StoreBySet {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Trainer1 t=new Trainer1();
		t.setName("lala");
		TreeSet<String> al=new TreeSet<String>();
		al.add("aaa");
		al.add("bbb");
		t.setSname(al);
		Trainer1 t1=new Trainer1();
		t1.setName("abhi");
		TreeSet<String> al1=new TreeSet<String>();
		al1.add("abc");
		al1.add("xyz");
		t1.setSname(al1);
		session.save(t);
		session.save(t1);
		tx.commit();
		session.close();
		System.out.println("done");

	}

}
