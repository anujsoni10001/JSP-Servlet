import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Trainer1;

public class ShowBySet {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Trainer1");
		List<Trainer1> al=qr.list();
		for(Trainer1 t:al)
		{
			System.out.println(t.getId()+" "+t.getName());
			Set<String> al1=t.getSname();
			for(String s:al1)
			{
				System.out.println(s);
			}
		}
		session.close();

	}

}
