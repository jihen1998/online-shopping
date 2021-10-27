package tn.esprit.shopping;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.shopping.entities.Categorie;
import tn.esprit.shopping.repositories.CategorieRepository;
import tn.esprit.shopping.services.CategorieService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategorieTests {
	  private static final Logger logger = LogManager.getLogger(CategorieTests.class);
	    @MockBean
	    CategorieRepository categorieRepository;
	    @Autowired
		CategorieService icategorieService;
	@Test
	 public void testCategorieAjout() {
		  logger.info("debut test ajout categorie");	  
		   Categorie category=new Categorie("2","electromanager");
		   logger.trace("affichage id categorie à ajouter: " + category.toString());
		  when(categorieRepository.save(category)).thenReturn(category);	
		  assertEquals(category, icategorieService.createAndModify(category));
		   logger.info(" test ajout category terminé");	  
	}
	@Test
	 public void testgetAllCategories() {
		  logger.info("debut test affichage categorie");	  
		   Categorie category=new Categorie("1","electromanager");
		   Categorie category2=new Categorie("2","informaique");
		   List<Categorie>listcategorie=new ArrayList<>();
		   listcategorie.add(category2);
		   listcategorie.add(category);
		  when(categorieRepository.findAll()).thenReturn(listcategorie);	
		  assertEquals(listcategorie.size(), icategorieService.getAllCategories().size());
		   logger.info(" test affichage category terminé");	  
	}
}
