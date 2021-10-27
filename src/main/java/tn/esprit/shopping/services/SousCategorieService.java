package tn.esprit.shopping.services;

import java.util.List;
import tn.esprit.shopping.entities.SousCategorie;

public interface SousCategorieService {

	public List<SousCategorie> getAllSousCategories();
	 public SousCategorie createAndModify(SousCategorie souscategorie);
}
