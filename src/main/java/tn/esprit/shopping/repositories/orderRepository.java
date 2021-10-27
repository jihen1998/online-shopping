package tn.esprit.shopping.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.shopping.entities.Order;
@Repository
public interface Orderrepository extends  MongoRepository<Order,  Integer> {

}
