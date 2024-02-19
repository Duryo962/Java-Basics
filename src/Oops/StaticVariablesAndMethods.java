package Oops;

public class StaticVariablesAndMethods {
// Static members access main method directly
// Other class static members access by using class name
	public static int age=23;
	public static void player() {
		System.out.println("M S Dhoni & Virat Kohli");
	}
	public static void main(String[] args) {
		System.out.println(SecondClass.name);
		System.out.println(age);
		SecondClass.game();
		player();


	}

}
class SecondClass
{
	public static String name="Duryodhana";
	
	public static void game() {
		System.out.println("Cricket");
	}
}
