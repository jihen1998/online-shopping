package tn.esprit.shopping.services;

import java.util.List;
import tn.esprit.shopping.entities.*;

public interface CategorieService {
	public List<Categorie> getAllCategories();
	 public Categorie createAndModify(Categorie categorie);
}
