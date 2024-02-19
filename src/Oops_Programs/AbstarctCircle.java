package Oops_Programs;

public class AbstarctCircle extends AbstractShape {

	private double length;
	private double width;
	private double radius;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public AbstarctCircle(double length, double width, double radius) {
		super();
		this.length = length;
		this.width = width;
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		System.out.println("Circle Area : "+Math.PI*radius*radius);
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Circle Perimeter : "+length*width);
		
	}
	

}
