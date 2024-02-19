package String_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StrngOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="aabbccaacddd";
    ArrayList<String> str1=new ArrayList<>();
    for(int a=0;a<=str.length()-1;a++)
    {
    	int count=0;
    	for(int b=0;b<=str.length()-1;b++)
    	{
    		if(str.charAt(a)==str.charAt(b))
    		{
    			count++;
    		}
    	}
    	str1.add(str.charAt(a)+""+count);

    }


    ArrayList<String> newList = new ArrayList<String>();
    

    for (String element : str1) {

        // If this element is not present in newList
        // then add it
        if (!newList.contains(element)) {

            newList.add(element);
        }
    }
    
for(int a=0;a<=newList.size()-1;a++)
{
	System.out.print(newList.get(a));
}
	}

}
