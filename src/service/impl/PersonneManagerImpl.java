/**
 * 
 */
package service.impl;

import java.util.Collection;

import model.Translation;
import service.PersonneManager;
import dao.TranslationDao;
import exception.BeanAlreadyExistException;
import exception.BeanNotExistException;

/**
 * @author jerome
 *
 */
public class PersonneManagerImpl implements PersonneManager {
	
	private TranslationDao personneDao;

	/**
	 * Création de la personne
	 * @param Translation 
	 */
	@Override
	public void createPersonne(Translation p) throws BeanAlreadyExistException {
		personneDao.createPersonne(p);

	}

	/* (non-Javadoc)
	 * @see service.PersonneManager#getPersonne(int)
	 */
	@Override
	public Translation getPersonne(int id) {
		return personneDao.getPersonne(id);
	}

	/* (non-Javadoc)
	 * @see service.PersonneManager#listePersonnes()
	 */
	@Override
	public Collection<Translation> listePersonnes() {
		return personneDao.listePersonnes();
	}

	@Override
	public void updatePersonne(Translation p) throws BeanNotExistException {
		personneDao.updatePersonne(p);
	}
	
	public TranslationDao getPersonneDao() {
        return personneDao;
    }
 
    public void setPersonneDao(TranslationDao personneDao) {
        this.personneDao = personneDao;
    }

}
