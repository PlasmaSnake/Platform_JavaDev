package BankInheritancePolymorphism;

public class Account extends Bank {
	protected double balance;
	
	
	Account(String branchLocation){
		super(branchLocation);
		balance = 0f;
	}
	
	@Override
	void checkBalance() {
		System.out.printf("The current balance is %.2f.\n", balance);
	}
}
