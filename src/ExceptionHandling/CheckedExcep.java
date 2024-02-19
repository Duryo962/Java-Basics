package ExceptionHandling;

public class CheckedExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
      System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array");
			
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic");
		}
		finally {
			System.out.println("Finally");
		}
	}

}
