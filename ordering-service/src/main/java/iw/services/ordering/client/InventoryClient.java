package iw.services.ordering.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import iw.services.ordering.model.Product;


@FeignClient("inventory-serivce")
public interface InventoryClient {

	@GetMapping("/product")
	public Iterable<Product> getAllProducts();
}
