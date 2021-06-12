import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		pp.Employee e=new pp.Employee();
		//e.setId(101);
		//e.setName("veer");
		Configuration cg=new Configuration(); 
		cg.configure("hibernate.cfg.xml");
		SessionFactory sf=cg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id ");
		e.setId(sc.nextInt());
		System.out.println("enter name ");
		e.setName(sc.next());
		int i=(int) session.save(e);
		//session.delete(e);
		tx.commit();
		//System.out.println(i+" record added");
		System.out.println(i+" record added");
		session.close();
	}

}
