package iw.services.inventory.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iw.services.inventory.model.Product;
import iw.services.inventory.repository.InventoryRepository;

@RestController
@RequestMapping(path="/product", produces={"application/json"})
public class InventoryController {
	@Autowired
	private InventoryRepository inventoryRepository;
	
	@GetMapping
	public Iterable<Product> getAllProducts(){
		return inventoryRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") Long id){
		Optional<Product> prod = inventoryRepository.findById(id);
		if(prod.isPresent())
			return prod.get();
		return null;
	}
	
	@PostMapping(consumes="application/json")
	public Product createProduct(@RequestBody Product product){
		//System.out.println("prodcut: " + product.getProductName() );
		return inventoryRepository.save(product);
	}
}
