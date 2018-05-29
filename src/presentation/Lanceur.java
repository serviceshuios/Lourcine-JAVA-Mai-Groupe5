package presentation;

import java.util.Hashtable;
import java.util.Map;

import domaine.Personne;
import service.Iservice;
import service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iservice service = new ServiceImpl() ; 
		Map <Integer, Personne> resultats = new Hashtable <Integer, Personne>() ; 
		System.out.println("AFFICHAGE MAP AVANT AJOUT");
		service.listerPersonnes(resultats);
		System.out.println("AJOUTER UNE PERSONNE");
		
		Personne p1 = new Personne(1, "ZEC", "UNION", 20) ;
		Personne p2 = new Personne(2, "ZEC2", "UNION2", 22);
		
		resultats = service.createPersonne(p1);
		resultats = service.createPersonne(p2);
		
		System.out.println("AFFICHAGE MAP APRES AJOUT");
		service.listerPersonnes(resultats);
	}

}
