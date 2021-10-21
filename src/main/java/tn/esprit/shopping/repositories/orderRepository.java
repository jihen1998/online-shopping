package tn.esprit.shopping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.shopping.entities.Order;
@Repository
public interface orderRepository extends CrudRepository<Order, Long> {

}
