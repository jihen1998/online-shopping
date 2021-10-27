package tn.esprit.shopping.services;

import java.util.List;

import tn.esprit.shopping.entities.Product;

public interface ProductService {
	public List<Product> getAllProducts() ;
	public Product getProduct(int id);
	public Product save(Product product);
}
