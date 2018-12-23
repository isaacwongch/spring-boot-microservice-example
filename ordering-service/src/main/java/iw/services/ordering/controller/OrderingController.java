package iw.services.ordering.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import iw.services.ordering.client.InventoryClient;
import iw.services.ordering.model.Product;

@Controller
public class OrderingController {

	@Autowired
	InventoryClient inventoryClient;
	
	@GetMapping("/")
	public String home(){
		Iterable<Product> ps = inventoryClient.getAllProducts();
		for(Product p : ps){
			System.out.println(p.getProductName());
		}
		
		return "home";
	}
	
//	@GetMapping("/listOfProducts")
//	public Iterable<Product> getListOfProducts(){
//		return inventoryClient.getAllProducts();
//	}
}
