package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			System.out.println(10/2);
			
		    }
		catch(ArithmeticException e)
		{
			System.out.println("Arithematc Exception Occured");
		}
		finally
		{
			System.out.println("Finally Block Executed");
		}
	}

}
