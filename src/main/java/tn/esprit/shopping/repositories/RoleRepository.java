package tn.esprit.shopping.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.shopping.entities.ERole;
import tn.esprit.shopping.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}