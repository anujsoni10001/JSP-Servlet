import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Student;
import pp.Trainer;

public class Store {

	public static void main(String[] args) {
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter total trainer");
	int tt=sc.nextInt();
	for(int j=1;j<=tt;j++)
	{
	System.out.println("enter tid "+j);
	Trainer t=new Trainer();
	t.setId(sc.nextInt());
	System.out.println("enter tname "+j);
	t.setName(sc.next());

	System.out.println("enter total students for trainer "+j);
	int size=sc.nextInt();
	ArrayList<Student> al=new ArrayList<Student>();
	for(int i=1;i<=size;i++)
	{
		System.out.println("enter student id "+i+" for trainer "+j);
		Student s1=new Student();
		s1.setId(sc.nextInt());
		System.out.println("enter student name "+i+" for trainer "+j);
		s1.setSname(sc.next());		
		System.out.println("enter student course "+i+" for trainer "+j);
		s1.setCourse(sc.next());
		al.add(s1);
		System.out.println("added");
	}
	
	t.setStudents(al);
	session.save(t);
	tx.commit();
	
	System.out.println("done for tainer "+j);
	}
	session.close();
	}

}
