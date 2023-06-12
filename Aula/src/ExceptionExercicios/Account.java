package ExceptionExercicios;

public class Account {
	private int Number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	public Account(int number, String holder, double balance, double withdrawLimit) {
		Number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public void deposit (double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) throws AccountException{
		if(amount > this.withdrawLimit) {
			throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
		}
		if(amount > this.balance) {
			throw new AccountException("Withdraw error: Not enough balance");
		}
		this.balance -= amount;
	}
	@Override
	public String toString() {
		return "New balance: " + this.balance;
	}
	
}
