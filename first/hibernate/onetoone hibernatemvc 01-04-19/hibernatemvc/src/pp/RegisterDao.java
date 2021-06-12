package pp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegisterDao {
Session session=new Configuration().configure().buildSessionFactory().openSession();;
Transaction tx=session.beginTransaction();
public int addEmp(Emp e)
{
	int i=(int) session.save(e);
			tx.commit();
			session.close();
			return i;
}
public void delete(Emp e)
{
 session.delete(e);
			tx.commit();
			session.close();
}
public void update(Emp e)
{
 session.update(e);
			tx.commit();
			session.close();
}
public List<Emp> show()
{
	Query qr=session.createQuery("from Emp");
	return (List<Emp>)qr.list();
}
}
