package iw.services.ordering.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iw.services.ordering.model.Order;
import iw.services.ordering.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		order = orderRepository.save(order);
		return null;
	}

	@Override
	public Order getOrder(Long id) {
		// TODO Auto-generated method stub
		Order order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException());
		return order;
	}

	@Override
	public Iterable<Order> getOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}
