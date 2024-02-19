package Oops;

//Super class having multiple subclasses is known as hierarchical inheritance
class Cricket1
{
	public static String name="Virat Kohli";
}
class Football extends Cricket1
{
	
}
class Kabaddi extends Cricket1
{
	
}

public class heirarchicalInheritance {
	public static void main(String[] args) {
		
		System.out.println(Cricket1.name);
		System.out.println(Football.name);
		System.out.println(Kabaddi.name);
	}

}

