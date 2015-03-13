// default package
// Generated 13 mars 2015 14:48:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Etudiant generated by hbm2java
 */
public class Etudiant implements java.io.Serializable {

	private int id;
	private Classe classe;
	private String nom;
	private String prenom;
	private Set matiereEtudiants = new HashSet(0);
	private Set etudiantMatieres = new HashSet(0);

	public Etudiant() {
	}

	public Etudiant(int id) {
		this.id = id;
	}

	public Etudiant(int id, Classe classe, String nom, String prenom,
			Set matiereEtudiants, Set etudiantMatieres) {
		this.id = id;
		this.classe = classe;
		this.nom = nom;
		this.prenom = prenom;
		this.matiereEtudiants = matiereEtudiants;
		this.etudiantMatieres = etudiantMatieres;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Classe getClasse() {
		return this.classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Set getMatiereEtudiants() {
		return this.matiereEtudiants;
	}

	public void setMatiereEtudiants(Set matiereEtudiants) {
		this.matiereEtudiants = matiereEtudiants;
	}

	public Set getEtudiantMatieres() {
		return this.etudiantMatieres;
	}

	public void setEtudiantMatieres(Set etudiantMatieres) {
		this.etudiantMatieres = etudiantMatieres;
	}

}
