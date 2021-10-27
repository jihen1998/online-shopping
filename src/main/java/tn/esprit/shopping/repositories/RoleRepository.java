package tn.esprit.shopping.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.shopping.entities.ERole;
import tn.esprit.shopping.entities.Role;

@Repository
public interface RoleRepository extends  MongoRepository<Role, Integer> {
	Optional<Role> findByName(ERole name);
}