package domaine;

import java.util.Hashtable;
import java.util.Map;

public class Personne {

	private int idPersonne;
	private String nom;
	private String prenom;
	private int age;
	private Map<Integer,Compte> comptes;
	private Map<Integer,Club> clubs;
	private Login login;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(int idPersonne, String nom, String prenom, int age, Map<Integer,Compte> comptes,
			Map<Integer,Club> clubs, Login login) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.comptes = new Hashtable<Integer, Compte>() ;
		this.comptes.putAll(comptes);
		this.clubs = new Hashtable<Integer, Club>() ;
		this.clubs.putAll(clubs);
		this.login = login;
	}
	
	

	public Personne(int idPersonne, String nom, String prenom, int age) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	

	/**
	 * @return the idPersonne
	 */
	public int getIdPersonne() {
		return idPersonne;
	}

	/**
	 * @param idPersonne
	 *            the idPersonne to set
	 */
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the comptes
	 */
	public Map<Integer,Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes
	 *            the comptes to set
	 */
	public void setComptes(Map<Integer,Compte> comptes) {
		this.comptes.putAll(comptes);
	}

	/**
	 * @return the clubs
	 */
	public Map<Integer, Club> getClubs() {
		return clubs;
	}

	/**
	 * @param clubs
	 *            the clubs to set
	 */
	public void setClubs(Map<Integer, Club> clubs) {
		this.clubs.putAll(clubs);
	}

	/**
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", comptes=" + comptes + ", clubs=" + clubs + ", login=" + login + "]";
	}
	
	

}
