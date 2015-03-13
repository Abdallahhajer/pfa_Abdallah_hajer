package dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Matiere
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)

	private int id; 

	private String nom;
	
	@OneToMany
	//@JoinTable(name="Matiere_Etudiant",joinColumns=@JoinColumn(name="ID"),inverseJoinColumns=@JoinColumn(name="ID"))
	
	private Collection<Etudiant> etudiant=new ArrayList<Etudiant>();
	public Collection<Etudiant> getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Collection<Etudiant> etudiant) {
		this.etudiant = etudiant;
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
}
