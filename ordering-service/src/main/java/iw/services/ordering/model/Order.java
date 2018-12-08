package iw.services.ordering.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Long id;
	private List<Product> products = new ArrayList<>();
	private Date orderDate;
	
	public Order(){
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
