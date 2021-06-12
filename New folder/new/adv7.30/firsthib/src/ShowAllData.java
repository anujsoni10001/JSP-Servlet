import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Emp;

public class ShowAllData {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Emp");
		//qr.setFirstResult(0);
		//qr.setMaxResults(3);
		List<pp.Emp> al=qr.list();
		for(Emp e:al)
		{
			System.out.println(e.getId()+"  "+e.getName()+" "+e.getJob());
		}
		session.close();
	}

}
