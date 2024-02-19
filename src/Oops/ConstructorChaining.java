package Oops;


public class ConstructorChaining {

	public static void main(String[] args) {
		UnEmployee u1=new UnEmployee("Duryodhana",'M',"duryodhanakaragana9@gmail.com",767592924);
		u1.displayDetails();
		Employee u2=new Employee("Duryodhana",'M',"duryodhanakaragana9@gmail.com",767592924,962);
		u2.displayDetails();
		

	}

}
