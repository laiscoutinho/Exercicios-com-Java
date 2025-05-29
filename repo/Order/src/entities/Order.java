package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Client client;
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.client = client;
		this.moment = moment;
		this.status = status;
	}
	public Order() {
	}
	
	
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem (OrderItem item) {
		items.add(item);
	}
	public void removeItem (OrderItem item) {
		items.remove(item);
	}
	public Double total() {
		double sum = 0.0;
		for (OrderItem i : items) {
			sum += i.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	
	
}
