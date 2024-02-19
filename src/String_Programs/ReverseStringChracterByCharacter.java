package String_Programs;

public class ReverseStringChracterByCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="Karagana Duryodhana";
       String reverse="";
       for(int a =str.length()-1;a>=0;a--)
       {
    	   reverse+=str.charAt(a);
       }
       System.out.println(reverse);
	}

}
