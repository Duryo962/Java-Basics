package ExceptionHandling;

import CustomExceptions.ArithematiceExceptions;
import CustomExceptions.NoDataException;

public class Custom1 {
public void rest() throws ArithematiceExceptions {
	throw new ArithematiceExceptions("ArithematicExceptionss");
}
	public static void main(String[] args) throws ArithematiceExceptions{
		// TODO Auto-generated method stub
      Custom1 c1=new Custom1();
      try {
      c1.rest();
      }
      catch(ArithematiceExceptions e) {
    	  System.out.println(e.getMessage());
      }
	}

}
