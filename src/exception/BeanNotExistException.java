/**
 * 
 */
package exception;

/**
 * @author jerome
 *
 */
public class BeanNotExistException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * Constructeur de classe de l'exception.
	 * 
	 * 
	 * 
	 * @param message
	 *            message ˆ retourner.
	 */

	public BeanNotExistException(String message) {

		super(message);

	}

}
