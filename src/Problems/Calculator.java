package Problems;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner Sc=new Scanner(System.in);
      double res;

    	  System.out.println("Please Enter Number");
    	  double num1=Sc.nextDouble();
    	  System.out.println("Please Select Operand");
    	  char ope=Sc.next().charAt(0);
    	  System.out.println("Please Enter Second Number");
    	  double num2=Sc.nextDouble();
    	  switch(ope) {
    	  case '+':{
    		        res=num1+num2;
    		        System.out.println("Sum of Two number "+res);
    	           }
    	  break;
    	  case '-':{
    		        res=num1-num2;
		             System.out.println("Sub of Two number "+res);
    	           }
    	  break;
    	  case '*':{
    		        res=num1*num2;
	                System.out.println("Sub of Two number "+res);
    	           }
    	  case '/':{
    		           res=num1/num2;
                       System.out.println("Sub of Two number "+res);
    	            }
    	  break;
    	  case '%':{
    		             res=num1%num2;
                          System.out.println("Sub of Two number "+res);
    	             }
    	  break;
    	  default:System.out.println("Please Select Right Operand");
    	  }
      }
     

}
