package String_Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello world , how are you ?";
	    String [] arr=str.split(" ");
	    StringBuffer s=new StringBuffer();
	    for(int a=arr.length-1;a>=0;a--)
	    {
	    	s.append(arr[a]+" ");
	    }
	    System.out.println(s);

	}

}
