package List;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringArrayBasedOnLength {
	
	public static void main(String[] args) {
		ArrayList<String> str1= new ArrayList<>();
	    str1.add("Duryodhana");
	    str1.add("Kishor");
	    str1.add("Sai");
	    str1.add("Afroz");
	    str1.add("Surya");
	    System.out.println("Normal Array : "+str1);
	    String temp="";
	    for(int a=0;a<str1.size();a++)
	    {
	    	for(int b=1;b<str1.size();b++)
	    	{
	    		if(str1.get(b-1).length()>str1.get(b).length())
	    		{
	    			temp=str1.get(b-1);
	    			str1.set(b-1, str1.get(b));
	    			str1.set(b, temp);    			
	    		}
	    	}
	    }
	    System.out.println(str1);
	}

}
