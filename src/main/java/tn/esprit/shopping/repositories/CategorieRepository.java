package tn.esprit.shopping.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.esprit.shopping.entities.Categorie;

public interface CategorieRepository extends MongoRepository<Categorie, Integer>{
	Optional<Categorie> findByName(String name);
}
