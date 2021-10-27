package tn.esprit.shopping.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.shopping.entities.Order;
import tn.esprit.shopping.repositories.Orderrepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    // orderRepository constructor injection
@Autowired Orderrepository orderRepository;
    @Override
    public Iterable<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }
	
    @Override
    public Order create(Order order) {
        order.setDateCreated(LocalDate.now());
        return this.orderRepository.save(order);
    }

    @Override
    public void update(Order order) {
        this.orderRepository.save(order);
    }
}