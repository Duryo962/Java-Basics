package Oops_Programs;

public class ATM {
	
private double amount;

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public void Withdraw(double withdrawAmount)
{
	if(withdrawAmount>amount)
	{
		System.err.println("Entered amount exceed totl amount");
	}
	else
	{
		double totalAmount=amount-withdrawAmount;
		setAmount(totalAmount);
		System.out.println("Total balance : "+getAmount());
	}
}

public void deposit(double depositAmount)
{
	double amoun=getAmount()+depositAmount;
	setAmount(amoun);
	System.out.println("Total Amount : "+getAmount());
}

public double checkBaance() {
	return getAmount();
}

}
