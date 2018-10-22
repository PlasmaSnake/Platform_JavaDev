package BankInheritancePolymorphism;

public class Checking extends Account {
	
	Checking(String branchLocation){
		super(branchLocation);
	}
	
	@Override
	void checkBalance() {
		System.out.println("===Checking Account===");
		super.checkBalance();
	}
	
	protected void deposit(double amt) {
		super.balance += amt;
		System.out.printf("%.2f deposited into the checking account.\n", amt);
	}
	
	protected void withdraw(double amt) {
		if (amt > super.balance) {
			System.out.printf("The current balance is smaller than the withdrawal amount requested.\n"
					+ "%.2f withdrawn from the checking account\n", super.balance);
			super.balance = 0;
			
		}
		else {
			super.balance -= amt;
			System.out.printf("%.2f withdrawn from the checking account.\n", amt);
		}
		checkBalance();
	}
	
	
	
}
