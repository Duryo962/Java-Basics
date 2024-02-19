package StandardPrograms;

public class PerfectNumbers1To100 {

	public static void main(String[] args) {
	for(int a=1;a<=100;a++)
	{
		int sum=0;
		for(int b=1;b<a;b++)
		{
			if(a%b==0)
			{
				sum=sum+b;
			}
		}
		if(sum==a)
		{
			System.out.println(a);
		}
	}

	}

}
