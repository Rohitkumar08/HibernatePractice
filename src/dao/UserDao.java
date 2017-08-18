package dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.internal.compile.CriteriaQueryTypeQueryAdapter;

import model.User;

public class UserDao {
	
	public static void registerInDb(User u){
		
		Configuration cfg= new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session s = sf.openSession(); 
		String hql= "update User set email='bk@gmail.com'  where id=1";
		Query q= s.createQuery(hql);
		q.executeUpdate();
		
		
//		s.save(u);
		
		Transaction t = s.beginTransaction();
		t.commit();
		
		s.evict(u);
		
		System.out.println("successfully added into the db");
		
		
	}
	
	
}
