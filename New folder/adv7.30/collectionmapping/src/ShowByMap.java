import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Trainer3;

public class ShowByMap {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Trainer3");
		List<Trainer3> al=qr.list();
		for(Trainer3 t:al)
		{
			System.out.println(t.getTid()+" "+t.getName());
			Map<String,String> hm=t.getStudents();
			for(Map.Entry i:hm.entrySet())
			{
				System.out.println(i.getKey()+" "+i.getValue());
			}
		}
	session.close();
	}
	

}
