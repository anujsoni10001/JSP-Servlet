import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Trainer t=new Trainer();
		tx.commit();
		session.close();

	}

}
