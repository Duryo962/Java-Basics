package Oops;


public class NonStaticVariablesAndMethods {
// Nonstatic members can not access directly rather create an object and access through reference variable
	public String name="Duryodhana";
	public void game() {
		System.out.println("Cricket");
	}
	public static void main(String[] args) {
		NonStaticVariablesAndMethods n=new NonStaticVariablesAndMethods();
		SecondOne s=new SecondOne();
		System.out.println(n.name);
		System.out.println(s.age);
		n.game();
		s.players();
 
	}

}
class SecondOne
{
	public int age=23;
	public void players() {
		System.out.println("M S Dhoni & Virat Kohli");
	}
}

