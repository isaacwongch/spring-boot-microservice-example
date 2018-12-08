package iw.services.ordering.model;

import java.math.BigDecimal;

public class Product {
	private Long id;
	private String productName;
	private String productDescription;
	private BigDecimal price;
	
	public Product(){
		
	}
	
	public Product(Long id, String productName, String productDescription,BigDecimal price){
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	} 
	
	
}
