package Oops_Programs;

public class AbstractTriangle extends AbstractShape {
	private double length; //base
	private double width;
	private double height;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public void calculateArea() {
		System.out.println("Area of the triangle : "+height*width);
		
	}
	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Area of the triangle : "+height*width*0.5);
		
	}
	
	

}
