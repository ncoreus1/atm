public class BankAccount {
	private static int accountnumber = 100000001;
	
	private double balance;
	private int accountNum;
	private AccountHolder account;
	
	BankAccount (double balance, AccountHolder account) {
		this.balance = balance;
		this.accountNum = BankAccount.accountnumber++;
		this.account = account;
	}
	
	public double getbalance(double balance) {
		return balance;
	}
	
	public int getaccountnumber(int accountnumber) {
		return accountnumber;
	}
	
	public AccountHolder getaccount(AccountHolder accountnumber) {
		return account;
	}
	
	public int deposit(double amount) {
		if (amount <= 0) {
			return 0;
		} else {
			balance = balance + amount;
			
			return 1;
		}
	}
	
	public int withdraw(double amount) {
		if (amount > balance) {
			return 0;
		} else if (amount <= 0) {
			return 1;
		} else {
			balance = balance - amount;
			
			return 2;
		}
	}
}