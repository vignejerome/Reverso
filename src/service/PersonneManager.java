package service;
import java.util.Collection;

import model.Translation;
import exception.BeanAlreadyExistException;
import exception.BeanNotExistException;

/**
 * 
 */

/**
 * @author jerome
 *
 */
public interface PersonneManager {
	
	public void createPersonne(Translation p) throws BeanAlreadyExistException;
	 
	public void updatePersonne(Translation p) throws BeanNotExistException;
	 
	public Translation getPersonne(int id);
	 
	public Collection<Translation> listePersonnes();

}
