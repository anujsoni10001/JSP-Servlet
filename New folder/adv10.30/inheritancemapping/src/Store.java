import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pp.Fulltime;
import pp.Parttime;
import pp.Trainer;

public class Store {
public static void main(String gg[])
{
Session session=new Configuration().configure().buildSessionFactory().openSession();
Transaction tx=session.beginTransaction();
Trainer t=new Trainer();
t.setId(101);
t.setName("rahul");
Parttime p=new Parttime();
p.setId(102);
p.setName("lala");
p.setPbatch(3);
p.setPerhour(3000);
Fulltime f=new Fulltime();
f.setId(103);
f.setName("abhi");
f.setBatches(8);
f.setSal(15000);
session.save(t);
session.save(p);
session.save(f);
tx.commit();
session.close();
System.out.println("done successfully");
}
}
