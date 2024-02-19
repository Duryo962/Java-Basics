package ExceptionHandling;
import java.lang.ArrayIndexOutOfBoundsException;
public class ArrayIndexOutOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {1,2,3,4,5};
      try {
    	         for(int a=0;a<=arr.length;a++)
    	         {
    		        System.out.println(arr[a]);
    	          }
          } catch(ArrayIndexOutOfBoundsException e) {
    		  System.out.println("Array Index Out Of Bound Exception Occured");
    	  }
      }
	}
