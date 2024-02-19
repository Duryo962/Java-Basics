package Oops_Programs;

public class PayPalPayment implements Payments {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("PayPal Process Payment : "+amount);
		
	}

	@Override
	public void refund(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paypal Refund Amount is : "+amount);
		
	}
	

}
