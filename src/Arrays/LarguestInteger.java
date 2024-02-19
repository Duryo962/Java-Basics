package Arrays;

public class LarguestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {25,45,84,95};
		
		int large=0;
		for(int a=0;a<arr.length-1;a++) {
			if(arr[a]<arr[a+1])
			{
				large=arr[a+1];
			}
		}
		System.out.println(large);

	}

}
