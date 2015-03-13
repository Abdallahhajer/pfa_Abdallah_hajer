package Test;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import dao.Classe;
import dao.Etudiant;
import dao.Matiere;

public class Test
{
			public static void main(String[] args)
			{
				Matiere mat = new Matiere();
				Classe classe = new Classe();
				Etudiant etudiant = new Etudiant();
				etudiant.setId(1);
				etudiant.setNom("jjjjj");
				etudiant.setPrenom("ffffff");
				etudiant.setClasse(classe);
				
				
				mat.setId(3);
				mat.setNom("mat");
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				session.save(etudiant);
				session.save(classe);
				session.save(mat);
				session.getTransaction().commit();
				
			}
			

}
