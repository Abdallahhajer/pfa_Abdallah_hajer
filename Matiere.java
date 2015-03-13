// default package
// Generated 13 mars 2015 14:48:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Matiere generated by hbm2java
 */
public class Matiere implements java.io.Serializable {

	private int id;
	private String nom;
	private Set etudiantMatieres = new HashSet(0);
	private Set matiereEtudiants = new HashSet(0);

	public Matiere() {
	}

	public Matiere(int id) {
		this.id = id;
	}

	public Matiere(int id, String nom, Set etudiantMatieres,
			Set matiereEtudiants) {
		this.id = id;
		this.nom = nom;
		this.etudiantMatieres = etudiantMatieres;
		this.matiereEtudiants = matiereEtudiants;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set getEtudiantMatieres() {
		return this.etudiantMatieres;
	}

	public void setEtudiantMatieres(Set etudiantMatieres) {
		this.etudiantMatieres = etudiantMatieres;
	}

	public Set getMatiereEtudiants() {
		return this.matiereEtudiants;
	}

	public void setMatiereEtudiants(Set matiereEtudiants) {
		this.matiereEtudiants = matiereEtudiants;
	}

}
