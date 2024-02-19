package StandardPrograms;

public class AlternatePrimeNumbers {

	public static void main(String[] args) {
	int prime=0;
	for(int a=1;prime<=200;a++)
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
			if(prime%2==0)
			{
				System.out.println(a);
			}
			prime++;
		}
	}

	}

}
