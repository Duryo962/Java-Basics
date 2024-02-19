package ExceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileNotFoundExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 File f1=new File("Java_Oops_Understanding_04-08-23.pdf");
    	 FileReader fr=new FileReader(f1);
     }
     catch(FileNotFoundException e) {
    	 System.out.println("File Not Found");
     }
	}

}
