package Arrays;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {1,5,6,7,1,8};
       Arrays.sort(arr);
       System.out.println(arr[arr.length-2]);
       
	}

}
