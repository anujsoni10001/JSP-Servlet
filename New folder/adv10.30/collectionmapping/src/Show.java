
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Trainer;

public class Show {
public static void main(String gg[])
{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Query qr=session.createQuery("from Trainer");
	List<Trainer> al=qr.list();
	for(Trainer t:al)
	{
		System.out.println(t.getId()+" "+t.getName());
		List<String> st=t.getSname();
		for(String s:st)
		{
			System.out.println(s);
		}
	}
	session.close();
}

}
