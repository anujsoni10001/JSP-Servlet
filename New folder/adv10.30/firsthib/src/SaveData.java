import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Employee;

public class SaveData {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter job");
		String job=sc.next();
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setJob(job);
		int i=(int) session.save(e);
		System.out.println(i+" record added");
		tx.commit();
		session.close();
		
	}

}
