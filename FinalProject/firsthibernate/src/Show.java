import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
//HQL(Hibernate Query Language)//
//Here Concept of HQL is used in Show of Hibernate//

//No Transaction is used in Show of Hibernate//

//No ACID Properties is Followed..//

//  HQL kee pachaan hai ye //
/// Query qr=session.createQuery("from Employee"); ///

/// #Remember #MVC #Show #Replacement in backend ///
//Wahee ResultSet Wagera Use Hote Hai Phir Unko Bckend Pe Collection Me Store//
//Krwate Hai....//
public class Show {

	public static void main(String[] args) {
	Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	Query qr=session.createQuery("from Employee");
	/////ArrayList<firsthibernate.Employee> a1=(ArrayList<Employee>) qr.list();
	List<firsthibernate.Employee> a1=qr.list();
	for(firsthibernate.Employee e:a1)
	{
	System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSal()+"  "+e.getDesignation()+"  "+e.getClass());	
	}
	session.close();
	}
}
