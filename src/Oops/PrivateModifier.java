package Oops;

public class PrivateModifier {
//Access Modifier
	// If you declare class ,variables and methods AccessSpecifier as private, we can access only withi in the class only.
	// We can't access same package differnt class
	// differnt package differnt class
	private static String name="Duryodhana";
	private int age=23;
	private static void playerName() {
		System.out.println("M S Dhoni");
	}
	private void age() {
		System.out.println("42");
	}
	 
	public static void main(String[] args) {
		System.out.println(name);
		PrivateModifier p=new PrivateModifier();
		System.out.println(p.age);
		playerName();
		p.age();
	}
	
}
class SecClaass
{

	public static void main(String[] args) {
//		PrivateModifier.age(); // private members can not access diifernt class it access only within the class only
	}
}
