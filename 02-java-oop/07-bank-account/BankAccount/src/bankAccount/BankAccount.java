package bankAccount;

import java.util.Random;
public class BankAccount  implements DepositWithdraw {

public String name;
public String type;
private String accountNumber;
private double Balance;
//private double checkingBalance;
private double savingsBalance;
public static int trackAccount = 0;
double deposit;
double withdrawal;

public static int accountTracker() {
	System.out.println("Number of Accounts: " + trackAccount);
	return trackAccount;
}
public String getAccountNumber() {
	return accountNumber;
}
private static String generateAccountNum(){
	String subst = "";
	Random r = new Random();
	for(int i = 0; i < 10; i++) {
		subst += r.nextInt(10);
	}
	return subst;
}
public BankAccount (String nameParam, String typeParam, double BalanceParam) {
	this.accountNumber = BankAccount.generateAccountNum();
	name = nameParam;
	type = typeParam;
	Balance = BalanceParam;
	BankAccount.trackAccount ++;
}
//public void showMyMoney() {
//	this.setBalance(savingsBalance);
//	System.out.println("Checking Balance " + checkingBalance + "Savings Balance " + getBalance());
//}
public double deposit(double deposit){
	this.deposit = deposit;
	this.Balance = getBalance() + deposit;
	System.out.printf("Deposit amount: d%. New account balance is d%.", this.deposit, this.savingsBalance);
	return this.Balance;
}
public double withdraw(double withdrawal){
	this.withdrawal = withdrawal;
	this.Balance = getBalance();
	if(Balance < 0) {
		System.out.println("Oops, insufficient funds for this transaction");
	}
	else {
		Balance = Balance - withdrawal;
		Balance = this.savingsBalance;
		System.out.printf("Withdrawal amount: d%. New account balance is d%.", this.withdrawal, this.savingsBalance);
	}
	return Balance;
}

public double getBalance() {
	return Balance;
}
public void setBalance(double savingsBalance) {
	this.savingsBalance = savingsBalance;
}

}

	



