package dao;

import java.util.Collection;

import model.Translation;
import exception.BeanAlreadyExistException;
import exception.BeanNotExistException;


/**
 * @author jerome
 *
 */
public interface TranslationDao {
	 
    void createTranslation(Translation p) throws BeanAlreadyExistException;
 
    void updateTranslation(Translation p) throws BeanNotExistException;
 
    Translation getTranslation(int id);
 
    Collection<Translation> listeTranslation();
 
    int countTranslation();
 
}
