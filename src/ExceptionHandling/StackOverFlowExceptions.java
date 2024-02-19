package ExceptionHandling;

public class StackOverFlowExceptions {

	 public static void kohli() {
		 dhoni();
	 } 
	 public static void dhoni() {
		 kohli();
	 }
	public static void main(String[] args) {
        kohli();
	}
}
