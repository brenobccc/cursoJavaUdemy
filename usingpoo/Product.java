package usingpoo;

public class Product {

	private String name;
	private Double price;
	private int quantity;
	
	
	public double totalValueInStock() {
		return (this.price*this.quantity);
	}
	
	public void addProducts(int quantity) {
		this.quantity+=quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity-=quantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public String toString() {
		return (this.name + ", "+String.format("%.2f", this.price)+", "+this.quantity);
	}

}
