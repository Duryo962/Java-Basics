package StandardPrograms;

public class First100PerfectNumbers {

	public static void main(String[] args) {

		int perfectNumber=0;
		for(int a=1;perfectNumber<=100;a++)
		{
			int sum=0;
			for(int b=1;b<a;b++)
			{
				if(a%b==0)
				{
					sum+=b;
				}
			}
			if(sum==a)
			{
				System.out.println(a);
				perfectNumber++;
			}
		}

	}

}
