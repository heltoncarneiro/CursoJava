package leitura_file;

public class Product {
	private String nome;
	private Double price;
	private int quantity;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(String nome, String price, String quantity) {
		this.nome = nome;
		this.price = Double.parseDouble(price);
		this.quantity = Integer.parseInt(quantity);
	}
	public double valorTotal() {
		return this.price*this.quantity;
	}
	@Override
	public String toString() {
		return nome + "," + String.format("%.2f", valorTotal()).replace(",", ".");
	}
	
	
}
