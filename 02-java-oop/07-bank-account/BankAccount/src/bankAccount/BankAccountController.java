package bankAccount;

public class BankAccountController {
public static void main(String[] args) {
	
	BankAccount jDoe = new Savings("John Doe", "Savings", 500.00);
	BankAccount jDoe2 = new Checking("John Doe", "Checking", 500.00);
	BankAccount lJohnson = new Savings("Larry Johnson", "Savings", 500.00);
	BankAccount lJohnson2 = new Checking("Larry Johnson", "Checking", 500.00);
	
	jDoe.deposit(100.00);
	jDoe2.deposit(100.00);
	lJohnson.deposit(2999.97);
	lJohnson2.deposit(1798.46);
	jDoe.withdraw(200.00);
	jDoe2.withdraw(200.00);
}
}	




