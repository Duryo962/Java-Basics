package Oops;

public class DefaultModifier {
	//Access Modifier
		// If you declare class ,variables and methods AccessSpecifier as Default, we can access
	    // Same package same class
	    // Same package differnt class
		// We can't access differnt package differnt class
	public static void main(String[] args) {
		Default.playerName();
	    System.out.println(Default.age);
	    Default d=new Default();
	    System.out.println(d.playerName);
	    d.age();

	}

}
 class Default
{
	static void playerName() {
		System.out.println("M S Dhoni");
	}
	static int age=42;
	
	void age() {
		System.out.println("36");
	}
	String playerName="Virat Kohli";
}
