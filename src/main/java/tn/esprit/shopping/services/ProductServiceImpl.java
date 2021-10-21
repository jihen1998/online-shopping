package tn.esprit.shopping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.shopping.entities.Product;
import tn.esprit.shopping.repositories.productRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    // productRepository constructor injection
@Autowired productRepository productRepository;
    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
          .findById(id)
          .get();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}