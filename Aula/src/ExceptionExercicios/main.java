package ExceptionExercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number:");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder:");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			sc.nextLine();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			sc.nextLine();
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("\nEnter amount for withdraw:");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println(account);
		}
		catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
