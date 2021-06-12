import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Trainer;

public class Store {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Trainer t=new Trainer();
		t.setName("abhi");
		ArrayList<String> al=new ArrayList<String>();
		al.add("vaibhav");
		al.add("rahul");
		t.setSname(al);
		Trainer t1=new Trainer();
		t1.setName("tanveer");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("payal");
		al1.add("prerna");
		t1.setSname(al1);
		session.save(t);
		session.save(t1);
		tx.commit();
		System.out.println("done");
		session.close();
		
	}

}
