package tn.esprit.shopping.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.shopping.entities.Categorie;
import tn.esprit.shopping.entities.SousCategorie;
import tn.esprit.shopping.services.CategorieService;
import tn.esprit.shopping.services.SousCategorieService;

@RestController
@RequestMapping("/api/souscategories")

public class SousCategorieController {
@Autowired SousCategorieService sousCategorieService;
	
    @GetMapping(value = { "", "/" })
    
    public List<SousCategorie> getSousCategories() {
        return sousCategorieService.getAllSousCategories();
    }

    @PostMapping("/add")
    public  SousCategorie create(SousCategorie souscategorie) {
        return sousCategorieService.createAndModify(souscategorie);
    }
}
