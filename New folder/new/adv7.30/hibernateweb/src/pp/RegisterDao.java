package pp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class RegisterDao {
	Session session;
Session getSession()
{
	 session=new Configuration().configure().buildSessionFactory().openSession();
	return session;
}
public int totalRecords()
{
	session=getSession();
	Query qr=session.createQuery("from Emp");
	List<Emp> al=qr.list();
	int i=al.size();
	return i;
}
public List<Emp> showPages(int i,int t)
{
	session=getSession();
	Query qr=session.createQuery("from Emp");
	qr.setFirstResult(i);
	qr.setMaxResults(t);
	List<Emp> al=qr.list();
	return al;
}
}
