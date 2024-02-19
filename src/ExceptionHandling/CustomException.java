package ExceptionHandling;

import CustomExceptions.NoDataException;

public class CustomException {

	public double calculateAverage(int[] arr) throws NoDataException
	{
		if(arr.length==0)
		{
			throw new NoDataException("Array is  empty");
		}
		int sum=0;
		for(int a=0;a<arr.length;a++)
		{
			sum=sum+arr[a];
		}
		return sum/arr.length;
	}
	public static void main(String[] args) throws NoDataException  {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		CustomException c1=new CustomException();
//		double average=c1.calculateAverage(arr);
//    	System.out.println("Average Of array : "+average);
        try {
        	double average=c1.calculateAverage(arr);
        	System.out.println("Average Of array : "+average);
        }catch(NoDataException e)
        {
        	System.out.println("No Data"+e.getMessage());
        }
		

	}

}
