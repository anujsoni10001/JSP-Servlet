import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Trainer;
import pp.Trainer1;

public class Store1 {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Trainer1 t=new Trainer1();
		t.setTid(101);
		t.setName("rahul");
		LinkedHashSet<String> al=new LinkedHashSet<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		t.setStudents(al);
		Trainer1 t1=new Trainer1();
		t1.setTid(102);
		t1.setName("abhi");
		LinkedHashSet<String> al1=new LinkedHashSet<String>();
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
