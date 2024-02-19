package String_Programs;


public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aancccccaaa";
		StringBuffer sb=new StringBuffer();
		char[] ch=new char[str.length()];
		for(int a=1;a<ch.length;a++)
		{
			ch[a]=str.charAt(a);
		}

		for(int a=1;a<=ch.length-1;a++)
		{
			int num=0;
			int count=0;
			for(int b=a;b<=ch.length-1;b++)
			{
			if(ch[a-1]==ch[b-1])
			{
				count+=count+1;
				num=b;
			}
			else
			{
				sb.append(ch[a]+""+count);
				a=b-1;
				break;
			}
			count++;
			}
			a=num;
		}
		System.out.println("Res :"+sb);

	}

}
