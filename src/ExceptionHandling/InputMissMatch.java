package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMissMatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			for(int a=0;true;a++)
			{
			System.out.println("please Enter Number");
			int num=sc.nextInt();
			System.out.println(num);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception in input Mismatch ");
		}
	}

}
