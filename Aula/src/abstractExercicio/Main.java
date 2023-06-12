package abstractExercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		char type;
		int number;
		ArrayList<taxPlayer> listTax = new ArrayList<>();
		double totalTax = 0;
		
		try {
			number = numberOfTax(sc);
			sc.nextLine();
		}
		catch (Exception e) {
			System.out.println("Erro de input!");
			number = 0;
		}
		for(int i = 1; i <= number; i++) {
			System.out.print("Individual or company (i/c)? ");
			type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				listTax.add(new Individual(nome, anualIncome, healthExpenditures));
			}else if(type == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				listTax.add(new Company(nome, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println("TAXES PAID:");
		for(taxPlayer tax : listTax) {
			System.out.println(tax.toString());
			totalTax += tax.tax();
		}
		System.out.printf("\n\nTOTAL TAXES: $  %.2f", totalTax);
		
		
		sc.close();
	}
	public static int numberOfTax(Scanner sc) {
		System.out.println("Enter the number of tax payers: ");
		return sc.nextInt();
	}

}
