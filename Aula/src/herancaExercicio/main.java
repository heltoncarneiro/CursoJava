package herancaExercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> listProducts = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int numberProducts; int price;
		char typeChar;
		String name;
		
		System.out.print("Enter the number of products: ");
		numberProducts = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < numberProducts; i++) {
			System.out.println("Product #"+(i+1)+" data");
			System.out.print("Common, used or imported (c/u/i)? ");
			typeChar = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Price: ");
			price = sc.nextInt();
			if(typeChar == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				sc.nextLine();
				listProducts.add(new ImportedProduct(name, price, customsFee));
			}else if (typeChar == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				System.out.println(manufactureDate);
				sc.nextLine();
				listProducts.add(new UsedProduct(name, price, manufactureDate));
			}else {
				listProducts.add(new Product(name, price));
			}
		}
		
		System.out.println("PRICE TAGS:");
		for(Product i: listProducts) {
			System.out.println(i.priceTag());
		}
		
		sc.close();
	}

}
