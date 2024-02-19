package Problems;
//Transactions Design a BankAccount class with attributes accountNumber and
//balance. Implement methods deposit(double amount) and withdraw(double amount) to handle
//account transactions. Ensure that withdrawals cannot exceed the available balance.
public class BankAccount {
	private int accountNumber;
	private double balance;
	public double temp;
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		BankAccount b1=new BankAccount();
		double bal=balance+amount;
		temp+= bal;
		b1.setBalance(bal);
		System.out.println("Total Balance : "+b1.getBalance());
		
	}
	
	public void withdrawn(double amount) {
		BankAccount b2=new BankAccount();
		System.out.println("Total Balance : "+temp);
		
	
		if(amount>temp)
		{
		System.err.println("Enter amount exceed total Balance ");	
		}else
		{
		double bal=temp-amount;
		
		b2.setBalance(bal);
		System.out.println("Total Balance : "+b2.getBalance());
		}
		
	}

}
