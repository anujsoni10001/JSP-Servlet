import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import java.util.Map;

import pp.Trainer3;

public class ShowByMap {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Trainer3");
		List<Trainer3> al=qr.list();
		for(Trainer3 t:al)
		{
			System.out.println(t.getId()+" "+t.getName());
			Map<String,String> hm=t.getSname();
			for(Map.Entry e:hm.entrySet())
			{
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
		session.close();
	}

}
