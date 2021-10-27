package tn.esprit.shopping.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.shopping.dto.SousCategorieDTO;
import tn.esprit.shopping.entities.SousCategorie;
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
    public  SousCategorie create(SousCategorieDTO souscategorie) {
    	SousCategorie persitentsouscategory=new SousCategorie(souscategorie.getIddto(),souscategorie.getNamedto(),souscategorie.getProducts(),souscategorie.getCategorie());
        return sousCategorieService.createAndModify(persitentsouscategory);
    }
}
