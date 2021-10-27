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
import tn.esprit.shopping.entities.Product;
import tn.esprit.shopping.repositories.Productrepository;
import tn.esprit.shopping.services.ProductService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTests {
	  private static final Logger logger = LogManager.getLogger(ProductTests.class);
	    @MockBean
	    Productrepository productRepository;
	    @Autowired
		ProductService iProductService;
	@Test
	 public void testProductAjout() {
		  logger.info("debut test ajout Product");	  
		   Product product=new Product("2","montre",(double)300);
		   logger.trace("affichage id Product à ajouter: " + product.toString());
		  when(productRepository.save(product)).thenReturn(product);	
		  assertEquals(product, iProductService.save(product));
		   logger.info(" test ajout product terminé");	  
	}
	@Test
	 public void testgetAllProducts() {
		  logger.info("debut test affichage Product");	  
		   Product product=new Product("1","montree",(double)200);
		   Product product2=new Product("2","montreee",(double)300);
		   List<Product>listProduct=new ArrayList<>();
		   listProduct.add(product2);
		   listProduct.add(product);
		  when(productRepository.findAll()).thenReturn(listProduct);	
		  assertEquals(listProduct.size(), iProductService.getAllProducts().size());
		   logger.info(" test affichage product terminé");	  
	}

}
