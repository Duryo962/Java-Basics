package Oops_Programs;

public class FindArea {

	public static void main(String[] args) {
		Circle c1=new Circle(20);
		System.out.println("Area of circle Shape    : "+c1.calculateArea());
		Rectangle r1=new Rectangle(20,40);
		System.out.println("Area of Rectangle Shape : "+r1.calculateArea());
		Triangle t1=new Triangle(45,48);
		System.out.println("Area of Triangle Shape  : "+t1.calculateArea());

	}

}
