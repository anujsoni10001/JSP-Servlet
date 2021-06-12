import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import pp.Emp;

public class Show {

	public static void main(String[] args) {
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		Criteria cr=session.createCriteria(Emp.class);
		
		//cr.add(Restrictions.gt("sal", 30000));
		//cr.add(Restrictions.between("sal", 25000, 30000));
		//cr.add(Restrictions.lt("sal", 30000));
		//cr.add(Restrictions.eq("sal", 31000));
		//cr.add(Restrictions.like("name", "a%"));
		/*List<Emp> al=cr.list();
		for(Emp e:al)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
		}*/
		//cr.setProjection(Projections.avg("sal"));
		cr.setProjection(Projections.max("sal"));
		//List<Double> al=cr.list();
		List<Integer> al=cr.list();
		for(Integer i:al)
		{
			System.out.println(i);
		}
		session.close();
	}

}
