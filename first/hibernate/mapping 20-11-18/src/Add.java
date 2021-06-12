import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Trainer;

public class Add {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction tx=session.beginTransaction();
		Trainer t=new Trainer();
		t.setTname("abhi");
		ArrayList<String> al=new ArrayList<String>();
		al.add("lala");
		al.add("anuj");
		al.add("ravi");
		t.setStudent(al);
		Trainer t1=new Trainer();
		t1.setTname("veer");
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("abc");
		al1.add("pqr");
		t1.setStudent(al1);
		session.save(t);
		session.save(t1);
		tx.commit();
		session.close();
		System.out.println("done");

	}

}
