import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Employee;

public class UpdateData {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter new name");
		String name=sc.next();
		System.out.println("enter new job");
		String job=sc.next();
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setJob(job);
		session.update(e);
		System.out.println(" record updated");
		tx.commit();
		session.close();

	}

}
