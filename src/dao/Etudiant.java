package dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
@Entity
public class Etudiant 
{
	    @Id @GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		@Column
		private String nom;
		@Column
		private String prenom;
		
		@ManyToMany
		//@JoinTable(name="Matiere_Etudiant",joinColumns=@JoinColumn(name="ID"),inverseJoinColumns=@JoinColumn(name="ID"))
		private Collection<Matiere> matiere=new ArrayList<Matiere>();
		
		public Collection<Matiere> getMatiere() {
			return matiere;
		}
		public void setMatiere(Collection<Matiere> matiere) {
			this.matiere = matiere;
		}
		@OneToOne
		@JoinColumn(name="id_classe")
		private Classe classe;
		
		public Classe getClasse() {
			return classe;
		}
		public void setClasse(Classe classe) {
			this.classe = classe;
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
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

	}


