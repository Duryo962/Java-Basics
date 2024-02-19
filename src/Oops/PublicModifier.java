package Oops;

public class PublicModifier {
// Public modifier
// If you declare class ,variables and methods AccessSpecifier as public, we can access any where
// Access same package same class.
// Same package different class
// Different package different class
	public static String name="M S Dhoni";
	public static void age() {
		System.out.println("42");
	}
	public String name1="Virat Kohli";
	public void age1() {
		System.out.println("36");
	}


}
class Crick
{
	public static void main(String[] args) {
		System.out.println(PublicModifier.name);
		PublicModifier.age();
		// For non static members create object 
		PublicModifier p=new PublicModifier();
		System.out.println(p.name1);
		p.age1();
	}
}

