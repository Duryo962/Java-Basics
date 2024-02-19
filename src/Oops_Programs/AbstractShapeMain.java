package Oops_Programs;

public class AbstractShapeMain {

	public void code(AbstarctCircle c)
	{
	c.calculateArea();
	c.calculatePerimeter();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstarctCircle c1=new AbstarctCircle(20,50,20);
		c1.calculateArea();
		c1.calculatePerimeter();
		AbstractRectangle r1=new AbstractRectangle(20,40);
		r1.calculateArea();
		r1.calculatePerimeter();
		

	}

}
