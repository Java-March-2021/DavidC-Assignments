package bankAccount;

public class Checking extends BankAccount implements DepositWithdraw {
	
	public String name;
//	private String accountNumber;
	private double Balance;
	double deposit;
	double withdrawal;

	
	public Checking (String name, String type, double Balance) {
		super(name, type, Balance);
		this.name = name;
		this.type = type;
		this.Balance = Balance;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double Balance) {
		this.Balance = Balance;
	}

	
//	public double depositChecking(double deposit){
//		this.deposit = deposit;
//		double checkingBalance = getcheckingBalance() + deposit;
//		this.checkingBalance = checkingBalance;
//		checkingBalance = checkingBalance + deposit;
//		System.out.printf("%s withdrawal amount: d%. New account balance is d%.", this.name, this.deposit, this.checkingBalance);
//		return checkingBalance;
//	}
//	public double withdrawChecking(double withdrawal){
//		this.withdrawal = withdrawal;
//		double checkingBalance = getcheckingBalance();
//		if(checkingBalance < 0) {
//			System.out.println("Oops, insufficient funds for this transaction");
//		}
//		else {
//		checkingBalance = checkingBalance - withdrawal;
//		System.out.printf("Withdrawal amount: d%. New account balance is d%.", this.withdrawal, this.checkingBalance);
//		}
//		return checkingBalance;
//	}
}
