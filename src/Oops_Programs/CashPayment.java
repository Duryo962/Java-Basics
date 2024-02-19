package Oops_Programs;

public class CashPayment implements Payments {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Cash Payment Process Amount is : "+amount);
		
	}

	@Override
	public void refund(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Cash Payment Refund Amount is : "+amount);
	}

}
