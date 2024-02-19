package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MerzeTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> list1=new ArrayList<>();
       list1.add(25);
       list1.add(45);
       list1.add(547);
       list1.add(74);
       list1.add(75);
       System.out.println("First Array List  : "+list1);
       Collections.sort(list1);
       System.out.println("After Sorting     : "+list1);
       ArrayList<Integer> list2=new ArrayList<>();
       list2.add(54);
       list2.add(96);
       list2.add(21);
       list2.add(10);
       System.out.println("Second ArrayList  : "+list2);
       Collections.sort(list2);
       System.out.println("After Sorting     : "+list2);
       ArrayList<Integer> merge=new ArrayList<>();
       for(int a=0;a<=list1.size()-1;a++)
       {
    	   merge.add(list1.get(a));
       }
       for(int a=0;a<=list2.size()-1;a++) {
    	   merge.add(list2.get(a));
       }
       System.out.println("Merge Two Arrays Result Array : "+merge);
       Collections.sort(merge);
       System.out.println("After Sorting Merze array : "+merge);
	}

}
