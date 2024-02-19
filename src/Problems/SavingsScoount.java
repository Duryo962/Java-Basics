package Problems;
import java.util.Scanner;
public class SavingsScoount {
	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void checkBalance() {
		System.out.println("CurrentBlancealance : "+balance);
	}

	public void withdraw(double amount) {
	if(amount>balance)
	{
		System.err.println("Entered Amount Exceed Current balance");
	}
	else
	{
	  balance=balance-amount;
	}
	}
	public void moneyTransfer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Account Number");
		int accountNumber=sc.nextInt();
		System.out.println("Re enter Account Number");
		int accountNumberCon=sc.nextInt();
		if(accountNumber==accountNumberCon)
		{
			System.out.println("Please Enter Money");
			double money=sc.nextDouble();
			balance=balance-money;
			System.out.println("Amount Transfer Successfully");
		}
		else
		{
			System.err.println("Account Number confirm account number not same");
		}
	}

	public void deposit(double amount1) {
		balance=balance+amount1;
	}

	public void operations() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Please Select Options");
			System.out.println("1 For Check Balance");
			System.out.println("2 For WithDraw");
			System.out.println("3 For Deposit");
			System.out.println("4 For Money Transfer");
			System.out.println("5 For Exit");
			int num=sc.nextInt();
			switch(num)
			{
			case 1:{ 
				     checkBalance();
			       }
			break;
			case 2:{
				    System.out.println("Please Enter Withdraw Amount");
				    double amount=sc.nextDouble();
				    withdraw(amount);
			       }
			break;
			case 3:{
				    System.out.println("Please Enter Deposit Amount");
				    double amount1=sc.nextDouble();
				    deposit(amount1);
			       }
			break;
			case 4:{
				      moneyTransfer();
			       }
			break;
			case 5:{
				    Accounts a1=new Accounts();
				    a1.accountsdetails();
			       }
		}
		
		
	}
	}
}
