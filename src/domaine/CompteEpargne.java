package domaine;

public class CompteEpargne extends Compte {
	
	private double pourcentage ;

	public CompteEpargne(double pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}
	
	

	public CompteEpargne(int idCompte, double pourcentage) {
		super(idCompte);
		this.pourcentage = pourcentage;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteEpargne [pourcentage=" + pourcentage + "]";
	} 
	
	

}
