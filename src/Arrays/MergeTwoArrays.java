package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr1= {1,5,7,8};
       int[] arr2= {6,1,3,5};
       int[] arr3=new int[arr1.length+arr2.length];
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       int count=0;
       int length=arr1.length-1;
       for(int a=0;a<=arr1.length-1;a++)
       {
    	   arr3[a]=arr1[a];
       }
       

       
       for(int a=length+1;a<arr3.length;a++) {
    	   arr3[a]=arr2[count];
    	   count++;
       }
       Arrays.sort(arr3);
       for(int a=0;a<=arr3.length-1;a++) {
    	   System.out.println(arr3[a]);
       }
       
    
	}

}
