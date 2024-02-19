package Problems;
import java.util.Scanner;
public class Accounts {
	public void accountsdetails()
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Please Select Options");
      System.out.println("1 For Saving Account");
      System.out.println("2 For Current Account");
      System.out.println("3 For Exit");
      int num=sc.nextInt();
      switch(num)
      {
      case 1:{
    	      SavingsScoount s1=new SavingsScoount();
    	      s1.operations();
             }
      break;
      case 2:{
    	     CurrentAccount c1=new CurrentAccount();
    	     c1.operations();
             }
      break;
      case 3:{
    	        sc.close();
		        System.exit(0);
             }
      default:{
    	      System.out.println("Please Enter Correct Option");
              }
      }
	}
}
