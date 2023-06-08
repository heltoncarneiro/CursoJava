package enumExercicios;

public class OrderItem {
	private int quantity;
	private Product product;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	public double subTotal() {
		return this.getProduct().getPrice() * this.quantity;
	}
	@Override
	public String toString() {
		return product.getName() + ", $" + product.getPrice()+",Quantity: "+ quantity +", Subtotal: $"+ subTotal() ;
	}
	
}
