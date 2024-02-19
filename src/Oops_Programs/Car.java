package Oops_Programs;

public class Car extends Vehicle {
	public Car(String make, String model) {
		super(make, model);
	}

	@Override
	public void start() {
		
		System.out.println("Car Details");
		System.out.println("Car Make : " +getMake());
		System.out.println("Car Model: "+getModel());
		System.out.println("Car Race Srtarts");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car Race Ended ");
		
	}
	



}
