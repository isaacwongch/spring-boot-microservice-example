package iw.services.ordering.repository;

import org.springframework.data.repository.CrudRepository;

import iw.services.ordering.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{
	
}
