package tn.esprit.shopping.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.shopping.entities.Categorie;

public interface CategorieRepository extends CrudRepository<Categorie, Long>{
	Optional<Categorie> findByName(String name);

}
