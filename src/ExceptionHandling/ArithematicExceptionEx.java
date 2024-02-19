package ExceptionHandling;

import java.util.Scanner;

public class ArithematicExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Please ENter Number 1");
			int num1=sc.nextInt();
			System.out.println("Please Enter Number 2");
			int num2=sc.nextInt();
			System.out.println(num1+"/"+num2+"="+num1/num2);
		}
		catch(ArithmeticException e){
			System.out.println("Arithematic Exception Occured");
		}

	}

}
