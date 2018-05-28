package domaine;

import java.util.Collection;

public class Club {
	private int idClub;
	private String nomClub;
	private Collection<Personne> adherants;
	
	
	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Club(int idClub, String nomClub, Collection<Personne> adherants) {
		super();
		this.idClub = idClub;
		this.nomClub = nomClub;
		this.adherants = adherants;
	}


	/**
	 * @return the idClub
	 */
	public int getIdClub() {
		return idClub;
	}
	/**
	 * @param idClub the idClub to set
	 */
	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}
	/**
	 * @return the nomClub
	 */
	public String getNomClub() {
		return nomClub;
	}
	/**
	 * @param nomClub the nomClub to set
	 */
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	/**
	 * @return the adherants
	 */
	public Collection<Personne> getAdherants() {
		return adherants;
	}
	/**
	 * @param adherants the adherants to set
	 */
	public void setAdherants(Collection<Personne> adherants) {
		this.adherants = adherants;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Club [idClub=" + idClub + ", nomClub=" + nomClub + ", adherants=" + adherants + "]";
	}
	
	

	
}
