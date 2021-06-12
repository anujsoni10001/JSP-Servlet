import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Que;

public class AddBySet {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Que q=new Que();
		q.setQues("what is hibernate");
		HashSet<String> hs=new HashSet<String>();
		hs.add("hibernate is a orm tool");
		hs.add("hibernate is a frammework");
		q.setAns(hs);
		Que q1=new Que();
		q1.setQues("what is java");
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("java is programming language");
		hs1.add("java is a technology");
		q1.setAns(hs1);
		session.save(q);
		session.save(q1);
		tx.commit();
		session.close();
		System.out.println("done");
	}

}
