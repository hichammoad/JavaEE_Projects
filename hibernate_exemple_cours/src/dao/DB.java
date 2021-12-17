package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Etudiant;

public class DB {

	public static SessionFactory sessionFactory;
	public static Session session;

	public DB() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sessionFactory.openSession();
	}

	public void createEtudiant(Etudiant e) {
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();
	}

	public void deleteEtudiant(Etudiant e) {
		session.beginTransaction();
		session.delete(e);
		session.getTransaction().commit();
	}

	public void updateEtudiant(Etudiant e) {
		session.beginTransaction();
		session.update(e);
		session.getTransaction().commit();
	}

	public List<Etudiant> getAll() {
		return (session.createQuery("from etudiant", Etudiant.class).getResultList());
	}

}
