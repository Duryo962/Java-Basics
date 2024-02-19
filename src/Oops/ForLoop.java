package Oops;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("Please Enter Name");
     String name=scan.nextLine();
     
     System.out.println("How many times print your name");
     int num=scan.nextInt();
     
     for(int a=1;a<=num;a++)
     {
   	  if(a==num/2)
   	  {
   		  break;// break statement is used to break the loop
   	  }
   	  System.out.println(name); 
   	 
     }
     
	}

}

