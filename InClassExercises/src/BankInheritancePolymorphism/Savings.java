package BankInheritancePolymorphism;

public class Savings extends Account{
	protected static double interestRate = .05;
	protected double interestTotal, depositTotal;
	
	Savings(String branchLocation){
		super(branchLocation);
		interestTotal = 0;
		depositTotal = 0;
	}
	
	@Override
	void checkBalance() {
		System.out.printf("The total deposited amount is %.2f\n"
				+ "The total amount of interest is %.2f.\n" , depositTotal, interestTotal);
		System.out.println("==Savings Account==");
		super.checkBalance();
		
	}
	
	protected void deposit(double amt) {
		double interest = (super.balance*interestRate);
		interestTotal += interest;
		depositTotal += amt;
		super.balance += amt + interest;
		System.out.printf("%.2f deposited into the savings account\n"
				+ "Interest in the amount of %.2f added to the savings account.\n", amt, interest);
		checkBalance();
	}
}
