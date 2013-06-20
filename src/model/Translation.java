package model;

import java.sql.Date;

/**
 * @author jerome
 * 
 */
public class Translation {

	private int id;
	private String contextCode;
	private String contextLabel;
	private int idLocale;
	private String contextLibelle;
	private Date date;

	/**
	 * Constructor
	 */
	public Translation() {
		super();
	}
	
	

	/**
	 * @param id
	 * @param contextCode
	 * @param contextLabel
	 * @param idLocale
	 * @param contextLibelle
	 * @param date
	 */
	public Translation(int id, String contextCode, String contextLabel, int idLocale, String contextLibelle, Date date) {
		super();
		this.id = id;
		this.contextCode = contextCode;
		this.contextLabel = contextLabel;
		this.idLocale = idLocale;
		this.contextLibelle = contextLibelle;
		this.date = date;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the contextCode
	 */
	public String getContextCode() {
		return contextCode;
	}

	/**
	 * @param contextCode the contextCode to set
	 */
	public void setContextCode(String contextCode) {
		this.contextCode = contextCode;
	}

	/**
	 * @return the contextLabel
	 */
	public String getContextLabel() {
		return contextLabel;
	}

	/**
	 * @param contextLabel the contextLabel to set
	 */
	public void setContextLabel(String contextLabel) {
		this.contextLabel = contextLabel;
	}

	/**
	 * @return the idLocale
	 */
	public int getIdLocale() {
		return idLocale;
	}

	/**
	 * @param idLocale the idLocale to set
	 */
	public void setIdLocale(int idLocale) {
		this.idLocale = idLocale;
	}

	/**
	 * @return the contextLibelle
	 */
	public String getContextLibelle() {
		return contextLibelle;
	}

	/**
	 * @param contextLibelle the contextLibelle to set
	 */
	public void setContextLibelle(String contextLibelle) {
		this.contextLibelle = contextLibelle;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}
