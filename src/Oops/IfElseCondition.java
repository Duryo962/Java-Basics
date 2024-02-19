package Oops;

import java.util.Scanner;
public class IfElseCondition {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please Enter Age");
	int age=scan.nextInt();
	if(age >=18)
	{
   System.out.println("Eligible for voting");
	}
	else
	{
	System.out.println("Ineligible for voting");
	}
	
	}

}
