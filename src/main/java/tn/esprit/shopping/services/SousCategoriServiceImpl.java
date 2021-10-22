package tn.esprit.shopping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.shopping.entities.Categorie;
import tn.esprit.shopping.entities.SousCategorie;
import tn.esprit.shopping.repositories.CategorieRepository;
import tn.esprit.shopping.repositories.SousCategorieRepository;

@Service
public class SousCategoriServiceImpl implements SousCategorieService {

	@Autowired SousCategorieRepository sousCategorieRep;
	
	@Override
	public List<SousCategorie> getAllSousCategories() {
		return (List<SousCategorie>) sousCategorieRep.findAll();
	}

	@Override
	public SousCategorie createAndModify(SousCategorie souscategorie) {
		return sousCategorieRep.save(souscategorie);
	}

}
