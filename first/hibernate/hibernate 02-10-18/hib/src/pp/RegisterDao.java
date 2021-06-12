package pp;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegisterDao {
Session session=new Configuration().configure().buildSessionFactory().openSession();
Transaction tx;
public int addPro(Product p)
{
	int i=0;
	tx=session.beginTransaction();
	i=(int) session.save(p);
	return i;
}
}
