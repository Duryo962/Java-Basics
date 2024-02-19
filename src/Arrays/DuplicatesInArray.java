package Arrays;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {1,1,5,7,5,8,7,7};
      int[] duplicates=null;
      int len=0;
      for(int a=0;a<=arr.length-1;a++)
      {
    	  for(int b=a;b<=arr.length-1;b++)
    	  {
    		  if(arr[a]==arr[b])
    		  {
    			  duplicates[len]=arr[a];
    			  len++;
    		  }
    	  }
      }
      for(int a=0;a<=duplicates.length;a++)
      {
    	  System.out.println(duplicates[a]);
      }
	}

}
