import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.entity.Employee;

public class MainGet {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Employee e=(Employee)session.load(Employee.class, 11);
		if(e!=null){
		System.out.println("Emp Id="+e.getEmpId());
		System.out.println("Emp Name="+e.getName());
		}else{
			System.out.println("No Data Found");
		}
		session.close();
		System.out.println("Done");
		sf.close();
			}

}
