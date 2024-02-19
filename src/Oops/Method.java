package Oops;


public class Method {
	// Method is used to Perform Operations(java operations only)
	//Method classified into two types
	//1.Static 
	//2.Non-static
	//Static method can access main method directly
	//Non-static method can not access directly rather create a object by using reference variable we can call method
	// Syntax :- AccessSpecifier AccessModifier ReturnType MethodName() // Method Signature
	//{
	        // Method Initialization
	//}
	
	//Static Method
	public static void play() {
		System.out.println("Playing Cricket");
	}
	// Non-static method
	public  void playing() {
		System.out.println("Played ");
	}
	public static void main(String[] args) {
		play();// Static method can access Main method directly
		//Non static method can not access directly rather create a object and by using RF call method
		Method m=new Method();
		m.playing();
	}
	
	

}

