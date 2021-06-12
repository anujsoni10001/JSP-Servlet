package pp;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Show {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		//cr.add(Restrictions.between("sal", 25000, 35000));
		//cr.add(Restrictions.lt("sal", 30000));
		//cr.add(Restrictions.gt("sal", 30000));
		//cr.add(Restrictions.like("name", "l%"));
		//cr.setProjection(Projections.avg("sal"));
		
		//r.setProjection(Projections.max("sal"));
		cr.setProjection(Projections.min("sal"));
		List<Integer> al=cr.list();
		for(Integer e:al)
		{
			System.out.println(e);
			//System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
		}
		session.close();

	}

}
