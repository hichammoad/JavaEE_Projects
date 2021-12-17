
package exemple1;

import java.util.Date;

public class Etudiant {
	private int id;
	private String nom;
	private Date dateNaissance;

	public Etudiant() {
	}

	public Etudiant(int id, String nom, Date dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}