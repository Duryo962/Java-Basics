package StandardPrograms;

public class First100PrimeNumbers {

	public static void main(String[] args) {
	
		int prime=0;
		for(int a=1;prime<=100;a++)
		{
			int count=0;
			for(int b=1;b<=a;b++)
			{
				if(a%b==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a);
				prime++;
			}
		}

	}

}
