package domaine;

public class CompteSimple extends Compte {
	private double decouvert ;

	public CompteSimple(double decouvert) {
		super();
		this.decouvert = decouvert;
	}
	
	

	public CompteSimple(int idCompte, double decouvert) {
		super(idCompte);
		this.decouvert = decouvert;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteSimple [decouvert=" + decouvert + "]";
	}
	
	

}
