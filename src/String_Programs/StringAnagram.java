 package String_Programs;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String s1="Listen";
		String s2="Silent";
		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replaceAll("\\s", "").toLowerCase();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean res=Arrays.equals(ch1, ch2);
		if(res==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}

	    
		

	}

}
