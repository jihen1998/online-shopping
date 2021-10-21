package tn.esprit.shopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tn.esprit.shopping.entities.Product;

public interface productRepository extends CrudRepository<Product, Long>{

}
