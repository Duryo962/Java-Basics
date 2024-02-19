package String_Programs;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String sr="ABC";
      int length=sr.length();
      int temp=0;
      
      String[] arr=new String[length*(length+1)/2];
  	for(int a=0;a<length;a++) {
		for (int j=a;j<length;j++)
		{
			arr[temp]=sr.substring(a,j+1);
			temp++;
		}
  	}
  	
  	for(int a=0;a<arr.length;a++)
  	{
  		System.out.println(arr[a]);
  	}
	}
	


}
