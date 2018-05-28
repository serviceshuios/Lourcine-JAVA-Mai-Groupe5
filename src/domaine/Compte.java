package domaine;

public class Compte {
	
	private int idCompte ; 
	protected double solde ; 
	protected Personne proprietaire ;
	
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Compte(int idCompte, double solde, Personne proprietaire) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
		this.proprietaire = proprietaire;
	}


	/**
	 * @return the idCompte
	 */
	public int getIdCompte() {
		return idCompte;
	}
	/**
	 * @param idCompte the idCompte to set
	 */
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * @return the proprietaire
	 */
	public Personne getProprietaire() {
		return proprietaire;
	}
	/**
	 * @param proprietaire the proprietaire to set
	 */
	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", solde=" + solde + ", proprietaire=" + proprietaire + "]";
	} 
	
	

}
