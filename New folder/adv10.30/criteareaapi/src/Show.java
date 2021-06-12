import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import pp.Emp;

public class Show {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		//cr.add(Restrictions.gt("sal", 30000));
		//cr.add(Restrictions.lt("sal", 30000));
		//cr.add(Restrictions.eq("sal", 35000));
		//cr.setProjection(Projections.avg("sal"));
		cr.setProjection(Projections.max("sal"));
		List<Integer> al=cr.list();
		int i=al.get(0);
		System.out.println(i);
		for(Integer j:al)
		{
			System.out.println(j);
		}
		/*List<Emp> al=cr.list();
		for(Emp e:al)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
			
		}*/
		session.close();
	}

}
