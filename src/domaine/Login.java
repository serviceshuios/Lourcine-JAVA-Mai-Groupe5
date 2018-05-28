package domaine;

public class Login {
	private int idLogin;
	private String pseudo;
	private String mdp;
	private Personne proprietaire;
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Login(int idLogin, String pseudo, String mdp, Personne proprietaire) {
		super();
		this.idLogin = idLogin;
		this.pseudo = pseudo;
		this.mdp = mdp;
		this.proprietaire = proprietaire;
	}


	/**
	 * @return the idLogin
	 */
	public int getIdLogin() {
		return idLogin;
	}


	/**
	 * @param idLogin the idLogin to set
	 */
	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;
	}


	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}


	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}


	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
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
		return "Login [idLogin=" + idLogin + ", pseudo=" + pseudo + ", mdp=" + mdp + ", proprietaire=" + proprietaire
				+ "]";
	} 
	
	
	
	
	
}
