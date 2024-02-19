package Oops;

public class Constructor {
	// Constructor is a special type of method.
	//With in the constructor we can perform any operation but main purpose of the constructor to initialize non static variables.
	//Constructor name as class name.
	public String name;
	public int jerseyNo;
	public double average;
	public static char bloodGroup;
	public  String wifeName;// We can  also initialize static variables
	 
	public Constructor(String name,int jerseyNo,double average,char bloodGroup,String wifeName)
	{
		this.name=name; //this key word represents current value
		this.jerseyNo=jerseyNo;
		this.average=average;
		this.bloodGroup=bloodGroup;
		this.wifeName=wifeName;
	}
	public void displayDetails() {
		System.out.println("Player Name : "+name);
		System.out.println("Jersey No   : "+jerseyNo);
		System.out.println("Average     : "+average);
		System.out.println("Blood Group : "+bloodGroup);
		System.out.println("Wife Name   : "+wifeName);
		System.out.println("********************************");
	}
	public static void main(String[] args) {
		Constructor c=new Constructor("Virat Kohli",18,65.7,'A',"Anushka Sharma");
		Constructor c1=new Constructor("M S Dhoni",7,65.7,'B',"Sakshi");
         c.displayDetails();
         c1.displayDetails();
	}

}

