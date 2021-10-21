package tn.esprit.shopping.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.shopping.entities.*;
import tn.esprit.shopping.services.CategorieService;

@RestController
@RequestMapping("/api/categories")

public class CategorieController {
	@Autowired CategorieService categorieService;
	
    @GetMapping(value = { "", "/" })
    
    public List<Categorie> getCategories() {
        return categorieService.getAllCategories();
    }

    @PostMapping("/add")
    public  Categorie signin(Categorie categorie) {
        return categorieService.createAndModify(categorie);
    }
}