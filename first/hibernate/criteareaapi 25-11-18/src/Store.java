import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Emp;

public class Store {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("enter name");
String name=sc.next();
System.out.println("enter sal");
int sal=sc.nextInt();
Emp e=new Emp();
e.setName(name);
e.setSal(sal);
Session session=new Configuration().configure().buildSessionFactory().openSession();
Transaction tx=session.beginTransaction();
session.save(e);
tx.commit();
session.close();
System.out.println("done");
	}

}
