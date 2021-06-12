import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import firsthibernate.Employee;
//HQL(Hibernate Query Language)//
//Here Concept of HQL is used in Show of Hibernate//

//No Transaction is used in Show of Hibernate//

//No ACID Properties is Followed..//

//Here Concept of HQL is used in Show of Hibernate//
//HQL kee pachaan hai ye //
/// Query qr=session.createQuery("from Employee"); ///
public class Show2 {

	public static void main(String[] args) {
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Query qr=session.createQuery("from Employee");
	ArrayList<Employee> a1=(ArrayList<Employee>) qr.list();
	///List<firsthibernate.Employee> a1=qr.list();
	for(Employee e:a1)
	{
	System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSal()+"  "+e.getDesignation()+"  "+e.getClass());	
	}
	session.close();
	}
}
