package Oops_Programs;
import java.util.Random;
import java.util.Scanner;
public class AtmMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       Atm1 atm=new Atm1();
       Random ran=new Random();
       atm.setBalance(ran.nextInt(10000));
       
       
       while(true) 
       {
    	   System.out.println("Please Selet Options");
           System.out.println("1 For Check Balnce");
           System.out.println("2 For Withdraw Amount");
           System.out.println("3 for Deposite Amount");
           System.out.println("4 For Exit");
           int num =sc.nextInt();
    	   switch(num) 
    	   {
    	   case 1:{
    		       System.out.println("Current Balance : "+atm.checkbalance());
    	          }
    	   break;
    	   case 2:{
    		      System.out.println("Please Enter Withdraw Amount");
    		      double wAmount=sc.nextDouble();
    		      atm.withdraw(wAmount);
    	          }
    	   break;
    	   case 3:{
    		       System.out.println("Enter Deposit Amount");
 		           double dAmount=sc.nextDouble();
 		           atm.deposit(dAmount);
    	          }
    	   break;
    	   case 4:
    	          {
    	        	  System.out.println("Thanks For Visiting ATM");
                      sc.close();
                      System.exit(0);
    	        	      
    	          }
    	   break;
    	   default :{
    		         System.err.println("Please Enter Correct Option");
    	             }
    	   }
    	   
       }
	}

}
