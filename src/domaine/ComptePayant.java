package domaine;

public class ComptePayant extends Compte {
	
	private double taux ;

	public ComptePayant(double taux) {
		super();
		this.taux = taux;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ComptePayant [taux=" + taux + "]";
	} 
	
	

}
