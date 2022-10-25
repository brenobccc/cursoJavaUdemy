package exercicio_fixacao_enumeracoes;

import java.util.ArrayList;

public class OrderItem {
	private int quantity;
	private Double price;
	private Product product;
	
	public void subTotal() {
		this.price = this.product.getPrice() * this.quantity;
	}
	
	
	
	public Product getProduct() {
		return this.product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
