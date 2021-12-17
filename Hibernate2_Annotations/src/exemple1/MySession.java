package exemple1;

import java.util.Date;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MySession {

	
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session  =sessionFactory.openSession();
		
		Etudiant e = new Etudiant(2, "Moad" , new Date() );
		
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
	}
	
	
}




