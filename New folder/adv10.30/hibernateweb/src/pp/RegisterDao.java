package pp;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class RegisterDao {
public List<Emp> showRecords(int i,int t)
{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Query qr=session.createQuery("from Emp");
	qr.setFirstResult(i);
	qr.setMaxResults(t);
	List<Emp> al=qr.list();
	session.close();
	return al;
}
public int countRecords()
{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Query qr=session.createQuery("from Emp");
	List<Emp> al=qr.list();
	int i=al.size();
	session.close();
	return i;
	
}
public int Update(Emp e)
{
	Session session=new Configuration().configure().buildSessionFactory().openSession();
	Query qr=session.createQuery("update Emp set name=:name,job=:job where id=:id");
	qr.setString("name", e.getName());
	qr.setString("job", e.getJob());
	qr.setInteger("id", e.getId());
	qr.executeUpdate();
	Transaction tx=session.beginTransaction();
	int i=qr.executeUpdate();
	tx.commit();
	session.close();
	return i;

}
}