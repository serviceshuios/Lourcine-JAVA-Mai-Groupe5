package presentation;

import java.util.Hashtable;
import java.util.Map;

import domaine.Club;
import domaine.Compte;
import domaine.CompteEpargne;
import domaine.ComptePayant;
import domaine.CompteSimple;
import domaine.Login;
import domaine.Personne;
import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iservice service = new ServiceImpl() ;
		
		// ==========   Manipulation de l'objet Personne   ========================
		
		/*Map <Integer, Personne> resultats = new Hashtable <Integer, Personne>() ; 
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
		service.listerPersonnes(resultats);
		System.out.println("AJOUTER UNE PERSONNE");
		
		Personne p1 = new Personne(1, "ZEC", "UNION", 20) ;
		Personne p2 = new Personne(2, "ZEC2", "UNION2", 22);
		
		resultats = service.createPersonne(p1);
		resultats = service.createPersonne(p2);
		
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listerPersonnes(resultats);*/
		
		//  ========    Manipulation de l'objet Compte   ===========================
		
		/*Map <Integer, Compte> resultats = new Hashtable <Integer, Compte>() ;
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
		service.listerComptes(resultats);
		System.out.println("AJOUTER UN COMPTE");
		
		Compte simple = new CompteSimple(1,10);
		Compte epargne = new CompteEpargne(2,20) ;
		Compte payant = new ComptePayant(3,30) ;
		
		resultats = service.createCompte(simple);
		resultats = service.createCompte(epargne);
		resultats = service.createCompte(payant);
		
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listerComptes(resultats);*/
		
		// =======  Manipulation de l'objet Personne avec tous ces attributs ===========// 
		
		Map <Integer, Personne> personnes = new Hashtable<Integer, Personne>();
		Map <Integer, Compte> comptes = new Hashtable <Integer, Compte>() ;
		Compte simple = new CompteSimple(1,10);
		Compte epargne = new CompteEpargne(2,20) ;
		Compte payant = new ComptePayant(3,30) ;
		comptes = service.createCompte(simple);
		comptes = service.createCompte(epargne);
		comptes = service.createCompte(payant);
		
		Map<Integer,Club> club = new Hashtable<Integer, Club>();
		Club club1 = new Club (1,"Real Madrid");
		Club club2 = new Club (2, "Barcelona");
		club = service.createClub(club1);
		club = service.createClub(club2);
		
		Login login = new Login() ;
		login.setIdLogin(1234);
		login.setMdp("mdp");
				
		Personne p = new Personne(1, "boutra", "nadir", 29, comptes, club, login);
		personnes = service.createPersonne(p);
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listerPersonnes(personnes);
		
		
		
	}

}
