package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FindNthSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> list1=new ArrayList<>();
     list1.add(52);
     list1.add(41);
     list1.add(852);
     list1.add(547);
     list1.add(8547);
     list1.add(5842);
     System.out.println("Normal Array");
     System.out.println(list1);
     System.out.println("After Sorting");
//     Collections.sort(list1, Collections.reverseOrder());
     Collections.sort(list1);
     System.out.println(list1);
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Please Enter Whicj position smallest number you want ");
     try{
    	 int num=sc.nextInt();
    	 System.out.println(list1.get(num-1));
     }catch(InputMismatchException e)
     {
    	 System.err.println("Enter Correct input");
     }
	}

}
