package StandardPrograms;

import java.util.Scanner;

public class Roman {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int num=sc.nextInt();
	
	while(num>0) {
		if(num>=100000) {
			System.out.print("C");
			num=num-100000;
		}
		else if(num>=50000) {
			System.out.print("L");
			num=num-50000;
		}
		else if(num>=10000) {
			System.out.print("X");
			num=num-10000;
		}
		else if(num>=5000) {
			System.out.print("V");
			num=num-5000;
		}
		else if(num>=1000) {
			System.out.print("M");
			num=num-1000;
		}
		else if(num>=500) {
			System.out.print("D");
			num=num-500;
		}
		else if(num>=100){
			System.out.print("C");
			num=num-100;
		}
		else if(num>=50){
			System.out.print("L");
			num=num-50;
		}
		else if(num>=12) {
			System.out.print("XII");
			num=num-12;
		}
		else if(num>=11) {
			System.out.print("XI");
			num=num-11;
		}
		else if(num>=10) {
			System.out.print("X");
			num=num-10;
		}
		else if(num>=9) {
			System.out.print("IX");
			num=num-9;
		}
		else if(num>=8) {
			System.out.print("VIII");
			num=num-8;
		}
		else if(num>=7) {
			System.out.print("VII");
			num=num-7;
		}
		else if(num>=6) {
			System.out.print("VI");
			num=num-6;
		}
		else if(num>=5) {
			System.out.print("V");
			num=num-5;
		}
		else if(num>=4) {
			System.out.print("IV");
			num=num-4;
		}
		else if(num>=3) {
			System.out.print("III");
			num=num-3;
		}
		else if(num>=2) {
			System.out.print("II");
			num=num-2;
		}
		else if(num>=1) {
			System.out.print("I");
			num=num-1;
		}
		
	}
	
}
}
