package enumExercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println("Enter cliente data:\nname:");
		String name = sc.nextLine();
		System.out.println("Email:");
		String email = sc.nextLine();
		System.out.println("Birt date (DD/MM/YYYY)");
		Date birtDate = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(name, email, birtDate);
		System.out.println("Enter order data:\nStatus:");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), orderStatus, cliente);
		
		System.out.println("How many items to this order:");
		int numberOrderItems = sc.nextInt();
		for(int i = 0; i < numberOrderItems ; i++) {
			System.out.println("Enter #" + i+1 + " item data:");
			sc.nextLine();
			System.out.println("Product name: ");
			String nameProduct = sc.nextLine();
			System.out.println("Product price:  ");
			double price =  sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			order.addItens(new OrderItem(quantity, new Product(nameProduct, price)));
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: "+ sdf.format(order.getDate()));
		System.out.println("Order status: "+ order.getOrderStatus());
		System.out.println(order.getCliente().toString());
		for (OrderItem i : order.getListOrderItens()) {
			System.out.println(i.toString());
		}
		System.out.printf("Total price: $%.2f", order.total());
		sc.close();
	}

}
