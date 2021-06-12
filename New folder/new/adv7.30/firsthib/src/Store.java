import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Emp;

public class Store {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter job");
		String job=sc.next();
		Emp e=new Emp();
		e.setId(id);
		e.setName(name);
		e.setJob(job);
		int id1=(int) session.save(e);
		//session.delete(e);
		//session.update(e);
		tx.commit();
		session.close();
		System.out.println(id1+" record added");
	}

}
