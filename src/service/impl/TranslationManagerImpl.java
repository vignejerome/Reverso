/**
 * 
 */
package service.impl;

import java.util.Collection;

import model.Translation;
import service.TranslationManager;
import dao.TranslationDao;
import exception.BeanAlreadyExistException;
import exception.BeanNotExistException;

/**
 * @author jerome
 *
 */
public class TranslationManagerImpl implements TranslationManager {
	
	private TranslationDao translationDao;

	/**
	 * Création de la personne
	 * @param Translation 
	 */
	@Override
	public void createTranslation(Translation p) throws BeanAlreadyExistException {
		translationDao.createTranslation(p);

	}

	/* (non-Javadoc)
	 * @see service.PersonneManager#getPersonne(int)
	 */
	@Override
	public Translation getTranslation(int id) {
		return translationDao.getTranslation(id);
	}

	/* (non-Javadoc)
	 * @see service.PersonneManager#listePersonnes()
	 */
	@Override
	public Collection<Translation> listeTranslation() {
		return translationDao.listeTranslation();
	}

	@Override
	public void updateTranslation(Translation p) throws BeanNotExistException {
		translationDao.updateTranslation(p);
	}
	
	public TranslationDao getPersonneDao() {
        return translationDao;
    }
 
    public void setPersonneDao(TranslationDao personneDao) {
        this.translationDao = personneDao;
    }

}
