import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Trainer;
import pp.trainer2;

public class Store2 {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		trainer2 t=new trainer2();
		t.setTid(101);
		t.setName("rahul");
		List<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		t.setStudents(al);
		trainer2 t1=new trainer2();
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
