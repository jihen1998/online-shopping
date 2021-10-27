package tn.esprit.shopping.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.esprit.shopping.entities.User;

public interface Userrepository extends  MongoRepository<User,Integer> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
