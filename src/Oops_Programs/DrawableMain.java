package Oops_Programs;

public class DrawableMain {
public static void repeatMethod(DrawableInterface d1) {
	d1.draw();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawableInterface d1=new CircleInterface();
		DrawableInterface d2=new RectangleInterface();
		DrawableInterface d3=new TriangleInterface();
		repeatMethod(d3);
		repeatMethod(d1);
		repeatMethod(d2);
	}

}
