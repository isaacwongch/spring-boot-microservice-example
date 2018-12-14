package iw.services.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import iw.services.inventory.model.Product;

public interface InventoryRepository extends CrudRepository<Product, Long>{

}
