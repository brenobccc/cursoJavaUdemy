package exercicio_fixacao_enumeracoes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Order {
	private Date moment;
	private OrderStatus status;
	private ArrayList<OrderItem> orderItem;
	private Client client;
	
	Order(){
		this.orderItem = new ArrayList<OrderItem>();
		this.moment = Calendar.getInstance().getTime();
	}
	
	public void addItem(OrderItem item) {
		this.orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.orderItem.remove(item);
	}
	
	public Double total() {
		return 0.0;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public ArrayList<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(ArrayList<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
