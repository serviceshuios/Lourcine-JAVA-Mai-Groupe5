package service;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.Login;
import domaine.Personne;

public class ServiceImpl implements Iservice {

	private Map<Integer, Personne> personnes = new Hashtable<Integer, Personne>() ; 
	private Map<Integer, Compte> comptes = new Hashtable<Integer, Compte>() ;
	
	@Override
	public Map<Integer, Personne> createPersonne(Personne p) {
		// TODO Auto-generated method stub
		personnes.put(p.getIdPersonne(), p); 
		return personnes;
	}

	@Override
	public void readPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listerPersonnes (Map<Integer, Personne> personnes)  {
		// TODO Auto-generated method stub
		for (Map.Entry<Integer, Personne> entry : personnes.entrySet()) 
			System.out.println(entry);
		
	}
	
	// ==========   Methodes de l'objet Compte ==============================//

	@Override
	public Map <Integer, Compte> createCompte(Compte compte) {
		// TODO Auto-generated method stub
		comptes.put(compte.getIdCompte(), compte);
		return comptes ; 
	}

	@Override
	public void readCompte(Compte compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCompte(Compte compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCompte(Compte compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listerComptes(Map<Integer, Compte> comptes) {
		// TODO Auto-generated method stub
		
		for (Map.Entry<Integer, Compte> entry : comptes.entrySet()) 
			System.out.println(entry);
	
	}
	
	// ===========    Methodes de l'objet Club ========================// 

	@Override
	public void createClub(Club club) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readClub(Club club) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClub(Club club) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClub(Club club) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Club> listerClubs(int idClub) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createLogin(Login login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readLogin(Login login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLogin(Login login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLogin(Login login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Login> listerLogins(int idLogin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void attribuerCompte(Personne p, Compte compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void affilierClub(Personne p, Club club) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crediterCompte(Compte compte, double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debiterCompte(Compte compte, double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCompte(Compte compte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterTitulaire(Compte compte, Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterPersonneClub(Personne p, Club club) {
		// TODO Auto-generated method stub
		
	}

}
