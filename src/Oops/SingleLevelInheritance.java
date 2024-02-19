package Oops;

class class1 {
	//Super class will provide separate copy of its properties to each and every sub class.
	// Inheritance  achieving with "extends" keyword
	
	 //  Super class having only one sub class
  public static String name="Duryodhana";

}
class class2 extends class1
{
	 public static String name="Vikas";
}
class SingleLevelInheritance{
	 public static void main(String[] args) {
		System.out.println(class1.name);
		System.out.println(class2.name);
	}
}
