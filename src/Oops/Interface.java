package Oops;

interface Interface {
//Interface allows incomplete non static methods, complete static methods, static variables.
	public void run();
}
class Game implements Interface
{

	@Override
	public void run() {
		System.out.println("Running");
		
	}
	
}

class mainInterface{
	public static void main(String[] args) {
		Interface i1=new Game();
		// Interface reference variable implements classes objects
		i1.run();
	}
}
