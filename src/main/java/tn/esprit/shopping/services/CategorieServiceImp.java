package tn.esprit.shopping.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.shopping.entities.Categorie;
import tn.esprit.shopping.repositories.CategorieRepository;
@Service
public class CategorieServiceImp implements CategorieService {
	@Autowired CategorieRepository categorieRep;
	
	@Override
	public List<Categorie> getAllCategories() {
		return categorieRep.findAll();
	}

	@Override
	public Categorie createAndModify(Categorie categorie) {
		return categorieRep.save(categorie);
	}


}
