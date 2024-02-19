package Oops;

public class Inheritance extends MainClass{

	// inheritance means super class give separate copy of its properties to each and every sub class
	// Only non static member support inheritance because multi copy nature
	// Static members doesn't support inheritance because single copy ,static members share 
	public static void main(String[] args) {
		MainClass m=new MainClass();
		System.out.println(m.Name);
		System.out.println(m.centuries);
		m.PlayerName();
		m.centuries();
		
		// Super class properties implicitly extends sub class
		Inheritance i=new Inheritance();
		System.out.println(i.Name);
		System.out.println(i.centuries);
		i.PlayerName();
		i.centuries();

	}

}
class MainClass
{
	public static String Name="Sachin";
	public int centuries=100;
	public static void PlayerName() {
		System.out.println("Virat Kohli");
	}
	
	public void centuries() {
		System.out.println("100");
	}
}

