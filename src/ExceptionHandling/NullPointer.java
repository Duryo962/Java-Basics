package ExceptionHandling;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str=null;
       try {
    	   System.out.println(str.length());
       }
       catch(NullPointerException e) {
    	   System.out.println("Null Pinter Exception occured");
       }
	}

}
