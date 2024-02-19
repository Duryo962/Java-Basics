package ExceptionHandling;

public class NestedTryBock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   try {
    		   System.out.println(10/0);
    	   }catch(ArithmeticException e) {
    		   System.out.println(10/2);
    	   }
    	   
       }catch(Exception e)
       {
    	   System.out.println("Exception Raised");
       }
	}

}
