package StandardPrograms;
import java.util.Scanner;
public class PrimeNumberOrNot {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Number");
	int number=scan.nextInt();
	int count=0;
	for(int a=1;a<=number;a++)
	{
		if(number%a==0)
		{
			count++;
		}
		
	}
	if(count==2)
	{
		System.out.println("Prime Number");
	}
	else
	{
		System.out.println("Not an Prime number");
	}

	}

}
