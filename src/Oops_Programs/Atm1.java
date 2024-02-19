package Oops_Programs;

public class Atm1 {

    
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	// Check Balance Method
	public double checkbalance() 
	{
		return balance;
	}
	
	// Deposit Method
	public void deposit(double amount) 
	{
		balance=balance+amount;
	}
	
	// Withdraw Method
	public void withdraw(double amount) 
	{
		if(amount<=balance)
		{
		balance=balance-amount;
		}
		else
		{
			System.err.println("Entered Amount Exceed Current Balance");
		}
	 }
	
}
