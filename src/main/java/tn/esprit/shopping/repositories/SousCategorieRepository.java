package tn.esprit.shopping.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.shopping.entities.Categorie;
import tn.esprit.shopping.entities.ERole;
import tn.esprit.shopping.entities.Role;
import tn.esprit.shopping.entities.SousCategorie;

@Repository

public interface SousCategorieRepository extends CrudRepository<SousCategorie, Long> {
	Optional<SousCategorie> findByName(String name);
}
