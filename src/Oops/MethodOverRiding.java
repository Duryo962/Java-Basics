package Oops;
//Method OverRiding is also known as same method signature but different Method implementation.
//During Inheritance process sub class will change inherited super class method implementation.
//Over ride supports only non static methods.
class cricket{
public void cricketPlayer()
{
	System.out.println("M S Dhoni");
}
}
class FootBal1l extends cricket
{
	public void cricketPlayer()
	{
		System.out.println("Virat Kohli");
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		cricket c1=new cricket();
		FootBal1l f1=new FootBal1l();
		c1.cricketPlayer();
		f1.cricketPlayer();

	}

}
