package app;

import dao.DB;
import model.Etudiant;
import model.Notebook;

public class Main {
	public static void main(String[] args) {

		DB db = new DB();

		Etudiant e1 = new Etudiant(1, "Hicham");
		Etudiant e2 = new Etudiant(2, "Jamal");
		Etudiant e3 = new Etudiant(3, "Bilal");

		e1.getListModules().add(new Notebook(1, "Java notes", 200));
		e1.getListModules().add(new Notebook(2, "NoSQL notes", 10));

		db.createEtudiant(e1);
		db.createEtudiant(e2);
		db.createEtudiant(e3);

		for (Etudiant ee : db.getAll()) {
			System.out.println(ee.getId() + " " + ee.getNom());
		}

		e1.setNom("Hicham");
		db.updateEtudiant(e1);
		db.deleteEtudiant(e3);

		for (Etudiant ee : db.getAll()) {
			System.out.println(ee.getId() + " " + ee.getNom());
		}

	}
}
