package String_Programs;

import java.util.Arrays;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="How Are ?";
        str=str.replaceAll("\\s","");
        char[] ch=str.toCharArray();
        String upper="";
        String lower="";
        String special="";
        for(int a=0;a<ch.length;a++)
        {
           String s=ch[a]+"";
           
        	if(Character.isUpperCase(ch[a]))
        	{
        		upper+=ch[a]+"";
        	}
        	else if(Character.isLowerCase(ch[a]))
        	{
        		lower+=ch[a]+"";
        	}
        	else
        	{
        		special+=ch[a]+"";
        	}
        }
        char[] upp=upper.toCharArray();
        char[] low=lower.toCharArray();
        char[] spec=special.toCharArray();
   
        
       
	}



}
