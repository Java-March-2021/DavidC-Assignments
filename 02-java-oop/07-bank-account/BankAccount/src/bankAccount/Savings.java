package bankAccount;

public class Savings extends BankAccount implements DepositWithdraw {
	
	public String name;
//	private String accountNumber;
	private double Balance;
	double deposit;
	double withdrawal;

	
	public Savings (String name, String type, double Balance) {
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
	
//	public double depositSavings(double deposit){
//		this.deposit = deposit;
//		double savingsBalance = getsavingsBalance() + deposit;
//		savingsBalance = this.savingsBalance;
//		System.out.printf("Deposit amount: d%. New account balance is d%.", this.deposit, this.savingsBalance);
//		return savingsBalance;
//	}
//	public double withdrawSavings(double withdrawal){
//		this.withdrawal = withdrawal;
//		double savingsBalance = getsavingsBalance();
//		if(savingsBalance < 0) {
//			System.out.println("Oops, insufficient funds for this transaction");
//		}
//		else {
//			savingsBalance = savingsBalance - withdrawal;
//			savingsBalance = this.savingsBalance;
//			System.out.printf("Withdrawal amount: d%. New account balance is d%.", this.withdrawal, this.savingsBalance);
//		}
//		return savingsBalance;
//	}
}