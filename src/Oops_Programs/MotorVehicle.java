package Oops_Programs;

public class MotorVehicle extends Vehicle {

	public MotorVehicle(String make, String model) {
		super(make, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Motor Vehicle Details");
		System.out.println("Motor Veehicle Make : "+getMake());
		System.out.println("Motor Vahicle Model : "+getModel());
		System.out.println("Motor Vehicle Race Starts");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Motor Vehicle race Ended");
		
	}

	
}
