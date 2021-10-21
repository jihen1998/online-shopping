package tn.esprit.shopping.services;

import tn.esprit.shopping.entities.Order;

public interface OrderService {
	public Iterable<Order> getAllOrders();
	 public Order create(Order order);
	  public void update(Order order);
}
