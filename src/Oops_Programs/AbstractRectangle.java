package Oops_Programs;

public class AbstractRectangle extends AbstractShape {

	private double length;
	private double width;
	
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

	
	public AbstractRectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of the rectangle : "+length*width);
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("perimeter of the rectangle : "+length*width);
	}
	

}
