package tn.esprit.shopping;

import static org.junit.Assert.*;
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
import tn.esprit.shopping.entities.SousCategorie;
import tn.esprit.shopping.repositories.SousCategorieRepository;
import tn.esprit.shopping.services.SousCategorieService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SousCategorieTest {
		  private static final Logger logger = LogManager.getLogger(SousCategorieTest.class);
		    @MockBean
		    SousCategorieRepository sousCategorieRepository;
		    @Autowired
			SousCategorieService iSousCategorieService;
		@Test
		 public void testSousCategorieAjout() {
			  logger.info("debut test ajout sous_category");	  
			   SousCategorie category=new SousCategorie("2","electromanager");
			   logger.trace("affichage id SousCategorie à ajouter: " + category.toString());
			  when(sousCategorieRepository.save(category)).thenReturn(category);	
			  assertEquals(category, iSousCategorieService.createAndModify(category));
			   logger.info(" test ajout category terminé");	  
		}
		@Test
		 public void testgetAllSousSousCategories() {
			  logger.info("debut test affichag sous_categoriee");	  
			   SousCategorie souscategory=new SousCategorie("1","electromanager");
			   SousCategorie souscategory2=new SousCategorie("2","informaique");
			   List<SousCategorie>listSousCategorie=new ArrayList<>();
			   listSousCategorie.add(souscategory2);
			   listSousCategorie.add(souscategory);
			  when(sousCategorieRepository.findAll()).thenReturn(listSousCategorie);	
			  assertEquals(listSousCategorie.size(), iSousCategorieService.getAllSousCategories().size());
			   logger.info(" test affichage sous_category terminé");	  
		}
}
