package Problems;
import java.util.Scanner;
public class BankAccountMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Select Options 1 for Deposit & 2 for Withdraw ");
		int num=scan.nextInt();
		
		switch(num)
		{
		case 1:{
			System.out.println("Please Enter Amount");
			double amount=scan.nextDouble();
			BankAccount b1=new BankAccount();
//			b1.setBalance(amount);
			b1.deposit(amount);
		}
		break;
		case 2 :{
			System.out.println("Please Enter Amount");
			double amount1=scan.nextDouble();
			BankAccount b2=new BankAccount();
//			b2.setBalance(amount1);
            b2.withdrawn(amount1);
		}
		break;
		default :System.out.println("Please Select Valid Option");
		}
	
		}
	}
	


