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
public interface TranslationManager {
	
	public void createTranslation(Translation p) throws BeanAlreadyExistException;
	 
	public void updateTranslation(Translation p) throws BeanNotExistException;
	 
	public Translation getTranslation(int id);
	 
	public Collection<Translation> listeTranslation();

}
