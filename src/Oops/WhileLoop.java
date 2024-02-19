package Oops;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please Enter Name");
	String name=scan.nextLine();
	
	System.out.println("How many times print your name");
	int num=scan.nextInt();
	
	int i=1;
	while(i<=num)
	{
		System.out.println(name);
		i++;
		if(i==5)
		{
			break;
		}
		}

	}

}
