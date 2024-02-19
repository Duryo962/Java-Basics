package StandardPrograms;
import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Number");
		int number=scan.nextInt();
		int temp=number;
		int reverse=0;
		while(temp>0)
		{
			int lastDigit=temp%10;
			reverse=reverse*10+lastDigit;
			temp=temp/10;
		}
		if(number==reverse)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not an palindrome");
		}

	}

}
