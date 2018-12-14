package iw.services.ordering.services;

import iw.services.ordering.model.Order;

public interface OrderService {
	Order createOrder(Order order);
	
	Order getOrder(Long id);
	
	Iterable<Order> getOrders();
}
