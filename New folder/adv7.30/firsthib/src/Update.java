import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter id for update");
		int id=sc.nextInt();
		System.out.println("enter new name");
		String name=sc.next();
		System.out.println("enter new job");
		String job=sc.next();
		Query qr=session.createQuery("update Emp set name=?,job=? where id=?");
		qr.setParameter(0, name);
		qr.setParameter(1, job);
		qr.setParameter(2, id);
		int i=qr.executeUpdate();
		tx.commit();
		System.out.println(i+" record updated");
		session.close();
	}

}
