package Oops_Programs;

public class Triangle {
	private double base;
	private double height;
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public double calculateArea()
	{
		double area=0.5*base*height;
		return area;
	}

}
