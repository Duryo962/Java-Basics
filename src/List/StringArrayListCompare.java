package List;

import java.util.ArrayList;

public class StringArrayListCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> str1=new ArrayList<>();
     str1.add("Duryodhana");
     str1.add("Kishor");
     str1.add("Afroz");
     str1.add("Sai");
     str1.add("Surya");
     
     ArrayList<String> str2=new ArrayList<>();
     str2.add("Kishor");
     str2.add("Afroz");
     str2.add("Surya");
     ArrayList<String> result=new ArrayList<>();
     System.out.println("First String Array List  : "+str1);
     System.out.println("Second String Array List : "+str2);
     for(int a=0;a<=str1.size()-1;a++)
     {
    	int count=0; 
    	 for(int b=0;b<=str2.size()-1;b++)
    	 {
    		 if(str1.get(a).equals(str2.get(b)))
    		 {
    			 result.add(str1.get(a));
    		 }
 		 
    	 }
     }
     System.out.println("Result :"+result);
     
	}

}
