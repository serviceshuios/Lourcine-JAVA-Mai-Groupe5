package service;

import java.util.Collection;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public interface Iservice {
	
	// === CRUD Personne === //
	public Map <Integer, Personne> createPersonne(Personne p) ;
	public void readPersonne (Personne p) ;
	public void updatePersonne(Personne p);
	public void deletePersonne (Personne p) ;
	public void listerPersonnes (Map<Integer, Personne> personnes) ; 
	
	// ===  CRUD Compte === //
	
	public Map <Integer, Compte> createCompte(Compte compte); 
	public void readCompte (Compte compte);
	public void updateCompte(Compte compte);
	public void deleteCompte (Compte compte);
	public void listerComptes(Map<Integer,Compte> comptes) ;
	
	// === CRUD Club === //
	
	public void createClub(Club club); 
	public void readClub(Club club);
	public void updateClub(Club club);
	public void deleteClub(Club club);
	public Collection<Club> listerClubs(int idClub);
	
	// === CRUD LOGIN === / /
	public void createLogin(Login login);
	public void readLogin(Login login);
	public void updateLogin(Login login);
	public void deleteLogin(Login login);
	public Collection<Login> listerLogins(int idLogin);
	
	public void attribuerCompte(Personne p, Compte compte); 
	public void affilierClub(Personne p, Club club); 
	public void crediterCompte(Compte compte, double montant); 
	public void debiterCompte(Compte compte, double montant);
	public void supprimerCompte(Compte compte);
	public void ajouterTitulaire(Compte compte, Personne p); 
	public void ajouterPersonneClub(Personne p, Club club);

}
