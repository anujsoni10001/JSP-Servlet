import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Trainer;

public class Store {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Trainer t=new Trainer();
		t.setTid(101);
		t.setName("rahul");
		List<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		t.setStudents(al);
		Trainer t1=new Trainer();
		t1.setTid(102);
		t1.setName("abhi");
		List<String> al1=new ArrayList<String>();
		al1.add("aaa1");
		al1.add("bbb1");
		al1.add("ccc1");
		t1.setStudents(al1);
		session.save(t);
		session.save(t1);
		tx.commit();
		session.close();
		System.out.println("done");

	}

}
