package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Check;

@Entity(name = "notebook")
public class Notebook {
	@Id
	private int idNotebook;

	@Column(name = "libele")
	private String libele;

	@Column(name = "nmbrpages")
	private int nmbrpages;

	public Notebook() {
	}

	public Notebook(int idNotebook, String libele, int nmbrpages) {
		super();
		this.idNotebook = idNotebook;
		this.libele = libele;
		this.nmbrpages = nmbrpages;
	}

	public int getIdNotebook() {
		return idNotebook;
	}

	public void setIdNotebook(int idNotebook) {
		this.idNotebook = idNotebook;
	}

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	public int getNmbrpages() {
		return nmbrpages;
	}

	public void setNmbrpages(int nmbrpages) {
		this.nmbrpages = nmbrpages;
	}

}
