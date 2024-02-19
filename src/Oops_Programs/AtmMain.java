package Oops_Programs;
 import java.util.Scanner;
public class AtmMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Select Options");
		System.out.println("1 For Check Balance Service");
		System.out.println("2 For Money Deposit Service");
		System.out.println("3 For Withdeaw Service");
		ATM a1=new ATM();
		int num=sc.nextInt();
		switch(num) {
		case 1:{
			         System.out.println("Current balance : "+a1.checkBaance());
		        }
		break;
		case 2:{
			          System.out.println("Please Enter Deposit Amount");
			          double depositAmount=sc.nextDouble();
			           a1.deposit(depositAmount);
		}
		break;
		case 3:{
			         System.out.println("Please Enter Withdraw Amount");
			         double withdrawAmount=sc.nextDouble();
			         a1.Withdraw(withdrawAmount);
	        	}
		break;
		default :System.out.println("Please  Enter Correct Option");
		}


	}

}
