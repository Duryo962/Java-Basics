package Arrays;

public class DuplicatePresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {14,52,25,41};
		boolean present=false;
		
		for(int a=0;a<arr.length-1;a++)
		{
			for(int b=a;b<arr.length-1;b++)
			{
				if(arr[a]==arr[b+1])
				{
					present=true;
				}
			}
		}
		
		if(present==true)
		{
			System.out.println("Duplicate Present in a array");
		}
		else
		{
			System.out.println("No duplicates present in a array");
		}

	}

}
