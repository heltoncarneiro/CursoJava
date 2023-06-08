package enumExercicios;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private Date date;
	private OrderStatus orderStatus;
	private Cliente cliente;
	private ArrayList<OrderItem> listOrderItens = new ArrayList();
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<OrderItem> getListOrderItens() {
		return listOrderItens;
	}
	public void addItens(OrderItem item) {
		this.listOrderItens.add(item);
	}
	public void removeItens(OrderItem item) {
		this.listOrderItens.remove(item);
	}
	public double total() {
		double total = 0;
		for(OrderItem i: listOrderItens) {
			total += i.subTotal();
		}
		return total;
	}
	public Order(Date date, OrderStatus orderStatus, Cliente cliente) {
		super();
		this.date = date;
		this.orderStatus = orderStatus;
		this.cliente = cliente;
	}
	
}
