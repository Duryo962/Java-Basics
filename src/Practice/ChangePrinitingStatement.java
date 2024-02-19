package Practice;

import java.io.FileNotFoundException;
import java.io.PrintStream;

 abstract public class ChangePrinitingStatement extends PrintStream{
	

	public ChangePrinitingStatement(String fileName) throws FileNotFoundException {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void println(String s) {
		// TODO Auto-generated method stub
		super.println(""); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    PrintStream s=new PrintStream(System.out);
    
    s.println("fagffhsadv");   
	}
}
