import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Employee;

public class ShowById {
public static void main(String gg[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id for serch");
	int id=sc.nextInt();
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	//Query rs=session.createQuery("from Employee where id=? ");
	//rs.setInteger(0, id);
	Query rs=session.createQuery("from Employee where id=:id ");
	rs.setInteger("id", id);
	List<Employee> al=rs.list();
	for(Employee e:al)
	{
		System.out.println(e.getId()+"  "+e.getName());
	}
	session.close();
}
}
