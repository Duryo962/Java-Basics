package Oops_Programs;

import java.util.Scanner;
public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Select Operations");
		System.out.println("1 For Addition");
		System.out.println("2 For Sub");
		int num=sc.nextInt();
		switch(num) {
		case 1:{
			System.out.println("Please Enter Number 1");
			int num1=sc.nextInt();
			System.out.println("Please Enter Number 2");
			int num2=sc.nextInt();
			calculator c1=new calculator();
			c1.setNum1(num1);
			c1.setNum2(num2);
			System.out.println(c1.addition());
			 
		        }
		break;
		default:System.out.println("Please Enter Right Option");
		}

	}

}
