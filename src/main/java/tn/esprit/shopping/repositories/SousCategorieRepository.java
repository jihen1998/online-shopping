package tn.esprit.shopping.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.shopping.entities.SousCategorie;

@Repository

public interface SousCategorieRepository extends  MongoRepository<SousCategorie,  Integer> {
	Optional<SousCategorie> findByName(String name);
}
