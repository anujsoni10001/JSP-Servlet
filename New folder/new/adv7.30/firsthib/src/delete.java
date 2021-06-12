import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class delete {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter id for delete");
		int uid=sc.nextInt();
		Query qr=session.createQuery("delete from Emp where id=:id");
		qr.setParameter("id", uid);
		int i=qr.executeUpdate();
		tx.commit();
		System.out.println(i+" record deleted");
		session.close();
	}

}
