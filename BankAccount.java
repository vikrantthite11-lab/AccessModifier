package accessModifier;

public abstract class BankAccount {

	public double balance = 500;
	public abstract int deposit(int a);
	public abstract int withdraw(int b);
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = this.balance + balance;
	}
}
