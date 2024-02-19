package StandardPrograms;

import java.util.Scanner;

public class PerfectNumberOrNot {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Number");
		int number=scan.nextInt();
		var total=0;
		for(int a=1;a<number;a++)
		{
			if(number%a==0)
			{
				total=total+a;
			}
		}
		if(total==number)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println(total);
			System.out.println("Not an Perfect Number");
		}

	}

}
