package ExceptionHandling;

public class StringInexOutOfBounds {
public static void main(String[] args) {
	String str="Duryodhana";
	System.out.println("length of the string :"+str.length());
	try {
		System.out.println(str.substring(5, 11));
	}catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("String Index Out Of Bound Exception Raised");
	}
}
}
