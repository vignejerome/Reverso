/**
 * 
 */
package dao.impl;

import java.util.Collection;

import model.Translation;
import dao.TranslationDao;
import exception.BeanAlreadyExistException;
import exception.BeanNotExistException;

/**
 * @author jerome
 * 
 */
public class TranslationDaoImpl implements TranslationDao {

	@Override
	public void createTranslation(Translation p)
			throws BeanAlreadyExistException {
		
		
	}

	@Override
	public void updateTranslation(Translation p) throws BeanNotExistException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Translation getTranslation(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Translation> listeTranslation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countTranslation() {
		// TODO Auto-generated method stub
		return 0;
	}

}
