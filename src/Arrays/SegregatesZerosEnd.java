package Arrays;

public class SegregatesZerosEnd {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int[] arr= {1,0,85,0,52,0,852};
	  int[] seg=new int[arr.length];
	  int index=0;
	  for(int a=0;a<=arr.length-1;a++)
	  {
		  if(arr[a]!=0)
		  {
			  seg[index]=arr[a];
			  index++;
		  }
	  }
	  for(int a=0;a<=seg.length-1;a++)
	  {
		  System.out.println(seg[a]);
	  }
	}

}
