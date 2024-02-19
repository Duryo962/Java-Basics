package Oops;

public class GlobalVariables {
	//Global variables Declare once and we can use any where with in the class.
	//It is classified into two types.
	//1.Static variable.
	//2.Non-static variable.
	public static String name="Duryodhana";
	public int age=23;
	public static double weight=53.5;
	public char grade='A';
public static void main(String[] args) {
	System.out.println("Name     : "+name);// static variables access directly
	GlobalVariables g=new GlobalVariables();// Non-static variable can not access directly rather create a object
	System.out.println("Age      : "+g.age);
	System.out.println("Weight   : "+g.weight);// Static variable also call by using object reference
	System.out.println("Grade    : "+g.grade);
}
}

