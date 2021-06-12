import java.util.List;
import java.util.Map;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Manager;

public class ShowByMap {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Manager");
		List<Manager> al=qr.list();
		for(Manager m:al)
		{
			System.out.println(m.getId()+" "+m.getName());
			Map<String,String> hm=m.getEmps();
			for(Map.Entry i:hm.entrySet())
			{
				System.out.println(i.getKey()+"  "+i.getValue());
			}
		}
       session.close();
	}

}
