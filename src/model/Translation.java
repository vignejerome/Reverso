package model;

import java.sql.Date;

import lombok.Data;

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

}
