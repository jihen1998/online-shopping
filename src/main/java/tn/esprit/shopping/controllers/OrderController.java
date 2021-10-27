package tn.esprit.shopping.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import tn.esprit.shopping.dto.OrderDTO;
import tn.esprit.shopping.entities.Order;
import tn.esprit.shopping.services.OrderService;

public class OrderController {
	@Autowired OrderService orderService; 
	@PostMapping
	public ResponseEntity<Order> create(@RequestBody OrderDTO order) {
	Order orderpersist=new Order(order.getIddto(), order.getDateCreated(),order.getStatus(),order.getOrderProducts(),order.getUser());
	    this.orderService.update(orderpersist);
	    String uri = ServletUriComponentsBuilder
	      .fromCurrentServletMapping()
	      .path("/orders/{id}")
	      .buildAndExpand(orderpersist.getId())
	      .toString();
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Location", uri);

	    return new ResponseEntity<>(orderpersist, headers, HttpStatus.CREATED);
	}
}
