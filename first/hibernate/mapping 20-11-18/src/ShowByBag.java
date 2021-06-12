import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Trainer;

public class ShowByBag {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Trainer");
		List<Trainer> al=qr.list();
		for(Trainer t:al)
		{
			System.out.println(t.getId()+"  "+t.getTname());
			List<String> al1=t.getStudent();
			for(String s:al1)
			{
				System.out.println(s);
			}
		}
session.close();
	}

}
