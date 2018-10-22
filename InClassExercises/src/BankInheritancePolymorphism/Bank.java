package BankInheritancePolymorphism;

public class Bank {
	private static String bankName = "Bank of America";
	private String branchLocation;
	
	Bank(String bankLocation){
		this.branchLocation = bankLocation;
	}
	
	static void changeBank(String newBankName) {
		bankName = newBankName;
		System.out.println("The bank is now "+newBankName);
	}
	
	void checkLocation() {
		System.out.println("The current branch location is "+branchLocation);
	}
	
	void changeLocation(String location) {
		
		System.out.printf("The branch location is changed from %s to %s\n", branchLocation,location);
		branchLocation = location;
	}
	
	void checkBalance() {
		System.out.println("You need an account to check the balance");
	}
}
