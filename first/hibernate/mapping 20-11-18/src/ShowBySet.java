import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import pp.Que;

public class ShowBySet {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Query qr=session.createQuery("from Que");
		List<Que> al=qr.list();
		for(Que q:al)
		{
			System.out.println(q.getId()+" "+q.getQues());
			Set<String> st=q.getAns();
			for(String s:st)
			{
				System.out.println(s);
			}
		}
		session.close();
	}

}
