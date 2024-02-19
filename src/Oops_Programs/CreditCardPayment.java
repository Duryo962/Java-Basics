package Oops_Programs;

public class CreditCardPayment implements Payments {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit Card Processing Payment is : "+amount);
		
	}

	@Override
	public void refund(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit card Refund Amount is : "+amount);
		
	}
	

}
