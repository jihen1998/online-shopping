package tn.esprit.shopping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.shopping.entities.Product;
import tn.esprit.shopping.repositories.Productrepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    // productRepository constructor injection
@Autowired Productrepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(int id) {
        return productRepository
          .findById(id).orElseThrow(null);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}