package uvsq21606235.DAO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import uvsq21606235.Personnes.GroupePersonnel;

public class DAOGroupePersonnel implements DAO<GroupePersonnel>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6198144658607662218L;
	
	private ArrayList<GroupePersonnel> listDAO;
	
	public  DAOGroupePersonnel() {
		// TODO Auto-generated constructor stub
		listDAO = new ArrayList<GroupePersonnel>();
	}

	@Override
	public void ajout(GroupePersonnel Object) {
		// TODO Auto-generated method stub
		if(!listDAO.contains(Object))
			listDAO.add(Object);
	}

	@Override
	public GroupePersonnel obtenirElement(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerElement(GroupePersonnel Object) {
		// TODO Auto-generated method stub
		listDAO.remove(Object);
	}

	@Override
	public void miseAjour(GroupePersonnel object, Map<String, Object> param) {
		// TODO Auto-generated method stub
		
	}

	

}
