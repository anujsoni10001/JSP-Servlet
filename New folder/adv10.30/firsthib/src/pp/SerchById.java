package pp;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SerchById {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		//Query qr=session.createQuery("from Employee where id=?");
		Query qr=session.createQuery("from Employee where id=:id");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id ");
		int id=sc.nextInt();
		//qr.setInteger(0, id);
		qr.setInteger("id", id);
		List<Employee> al=qr.list();
		for(Employee e:al)
		{
			System.out.println(e.getId()+"  "+e.getName());
		}
session.close();
	}

}
