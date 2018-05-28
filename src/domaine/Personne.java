package domaine;

import java.util.Collection;

public class Personne {

	private int idPersonne;
	private String nom;
	private String prenom;
	private int age;
	private Collection<Compte> comptes;
	private Collection<Club> clubs;
	private Login login;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(int idPersonne, String nom, String prenom, int age, Collection<Compte> comptes,
			Collection<Club> clubs, Login login) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.comptes = comptes;
		this.clubs = clubs;
		this.login = login;
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
	public Collection<Compte> getComptes() {
		return comptes;
	}

	/**
	 * @param comptes
	 *            the comptes to set
	 */
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * @return the clubs
	 */
	public Collection<Club> getClubs() {
		return clubs;
	}

	/**
	 * @param clubs
	 *            the clubs to set
	 */
	public void setClubs(Collection<Club> clubs) {
		this.clubs = clubs;
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
