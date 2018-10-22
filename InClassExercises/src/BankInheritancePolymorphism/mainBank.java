package BankInheritancePolymorphism;

public class mainBank {

	public static void main(String[] args) {
		//create Checking instance
		Checking checking = new Checking("Chase Bank");
		checking.deposit(100.00);
		checking.deposit(200.00);
		
		checking.withdraw(250);
		checking.deposit(300);
		checking.withdraw(400);
		System.out.println(":::::Savings account:::::");
		//create Savings instance
		Savings savings = new Savings("Chase Bank");
		savings.changeLocation("Bank of America");
		savings.deposit(100);
		savings.deposit(200);
		savings.deposit(300);
		
	}

}
