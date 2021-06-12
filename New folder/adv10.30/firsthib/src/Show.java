import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Employee;

public class Show {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		Query qr=session.createQuery("update Employee set name=:name where id=:id");
		qr.setString("name", name);
		qr.setInteger("id", id);
		Transaction tx=session.beginTransaction();
		int i=qr.executeUpdate();
		/*Employee e=(Employee) session.load(Employee.class, new Integer(id));
		System.out.println(e.getId()+" "+e.getName()+"  "+e.getJob());
		*/
		System.out.println(i+" updated");
		tx.commit();
		session.close();
	}

}
