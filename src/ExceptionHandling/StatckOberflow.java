package ExceptionHandling;

public class StatckOberflow {

	public void run() {
		runs();
	}
	public void runs() {
		run();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatckOberflow s1=new StatckOberflow();
		s1.run();
	}

}
