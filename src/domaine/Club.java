package domaine;

import java.util.Collection;
import java.util.Map;

public class Club {
	private int idClub;
	private String nomClub;
	private Map<Integer, Personne> adherants;

	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Club(int idClub, String nomClub, Map<Integer, Personne> adherants) {
		super();
		this.idClub = idClub;
		this.nomClub = nomClub;
		this.adherants.putAll(adherants);
	}

	public Club(int idClub, String nomClub) {
		super();
		this.idClub = idClub;
		this.nomClub = nomClub;
	}

	/**
	 * @return the idClub
	 */
	public int getIdClub() {
		return idClub;
	}

	/**
	 * @param idClub
	 *            the idClub to set
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
	 * @param nomClub
	 *            the nomClub to set
	 */
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}

	/**
	 * @return the adherants
	 */
	public Map<Integer, Personne> getAdherants() {
		return adherants;
	}

	/**
	 * @param adherants
	 *            the adherants to set
	 */
	public void setAdherants(Map<Integer, Personne> adherants) {
		this.adherants.putAll(adherants);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Club [idClub=" + idClub + ", nomClub=" + nomClub + ", adherants=" + adherants + "]";
	}

}
