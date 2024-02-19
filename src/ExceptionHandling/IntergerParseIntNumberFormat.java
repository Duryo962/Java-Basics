package ExceptionHandling;

import java.util.Scanner;

public class IntergerParseIntNumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		

		try {
			System.out.println("please Enter Number");
			int num= Integer.parseInt(sc.next());
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
		
			System.out.println("Exception in Number Format Exception");
		}
		finally {
			System.out.println("Finally Executed");
		}
	}

}
