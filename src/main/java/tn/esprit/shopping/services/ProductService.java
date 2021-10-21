package tn.esprit.shopping.services;

import tn.esprit.shopping.entities.Product;

public interface ProductService {
	public Iterable<Product> getAllProducts() ;
	public Product getProduct(long id);
	public Product save(Product product);
}
