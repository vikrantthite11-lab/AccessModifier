package accessModifier;

import accessModifieranother.BankOperation;

public class Controller {

	public static void main(String[] args) {
		
		BankOperation b = new BankOperation();
		b.getBalance();
		b.display();
		b.deposit(300);
	}
}
