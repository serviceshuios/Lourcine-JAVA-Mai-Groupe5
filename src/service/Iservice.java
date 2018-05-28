package service;

import java.util.Collection;

import domaine.Club;
import domaine.Compte;
import domaine.Personne;

public interface Iservice {
	
	// === CRUD Personne === //
	public void createPersonne(Personne p) ;
	public void readPersonne (Personne p) ;
	public void updatePersonne(Personne p);
	public void deletePersonne (Personne p) ;
	public Collection<Personne> listerPersonnes(int idPersonne) ;
	
	// ===  CRUD Compte === //
	
	public void createCompte(Compte compte); 
	public void readCompte (Compte compte);
	public void updateCompte(Compte compte);
	public void deleteCompte (Compte compte);
	public Collection<Compte> listerComptes(int idCompte) ;
	
	// === CRUD Club === //
	
	public void createClub(Club club); 
	public void readClub(Club club);
	public void updateClub(Club club);
	public void deleteClub(Club club);
	public Collection<Club> listerClubs(int idClub);
	
	public void attribuerCompte(Personne p, Compte compte); 
	public void affilierClub(Personne p, Club club); 
	public void crediterCompte(Compte compte, double montant); 
	public void debiterCompte(Compte compte, double montant);
	public void supprimerCompte(Compte compte);
	public void ajouterTitulaire(Compte compte, Personne p); 
	public void ajouterPersonneClub(Personne p, Club club);

}