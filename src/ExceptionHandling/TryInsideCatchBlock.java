package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TryInsideCatchBlock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
     try {
    	 System.out.println(10/0);
     }catch(ArithmeticException e)
     {
    	 try {
    		 System.out.println("Enter Divisible number");
    		 int num=Integer.parseInt(sc.next());
    		 System.out.println(num);
    	 }catch(NumberFormatException x)
    	 {
    		System.out.println(10/2); 
    	 }
     }

	}

}
