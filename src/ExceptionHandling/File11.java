package ExceptionHandling;
import java.io.*;
public class File11 {

	public static void main(String[] args) {
		try {
//       File f1=new File("String Answers.txt");
       FileReader f2=new FileReader("String Answers.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
     }

}
