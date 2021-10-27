package tn.esprit.shopping.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.esprit.shopping.entities.Product;

public interface Productrepository extends  MongoRepository<Product,  Integer>{

}
