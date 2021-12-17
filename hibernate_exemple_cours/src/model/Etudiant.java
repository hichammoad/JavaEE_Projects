package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "etudiant")
public class Etudiant {

	@Id
	private int id;

	@Column(name = "nom")
	private String nom;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, targetEntity = Notebook.class)
	@JoinColumn(name = "id")
	private List<Notebook> listModules = new ArrayList<Notebook>();

	public Etudiant() {
	}

	public Etudiant(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public List<Notebook> getListModules() {
		return listModules;
	}

	public void setListModules(List<Notebook> listModules) {
		this.listModules = listModules;
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

}
