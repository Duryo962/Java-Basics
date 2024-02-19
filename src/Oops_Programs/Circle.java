package Oops_Programs;

public class Circle  extends Shape{

	private double radius;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public double calculateArea() {
		double area=Math.PI*radius*radius;
		return area;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	

}
