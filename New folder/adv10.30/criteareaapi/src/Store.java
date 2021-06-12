import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Emp;

public class Store {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter sal");
		int sal=sc.nextInt();
		Emp e=new Emp();
		e.setId(id);
		e.setName(name);
		e.setSal(sal);
		session.save(e);
		}
		tx.commit();
		session.close();
		System.out.println("done");
	}

}
