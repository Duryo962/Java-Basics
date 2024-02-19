package ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Print {
	public static void main(String[] args){
		try {
         PrintWriter pw=new PrintWriter("String Answe.txt");
         pw.write("Duryodhana"); 
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}   
	}
}
