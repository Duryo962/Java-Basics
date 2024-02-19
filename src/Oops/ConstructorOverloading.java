package Oops;
public class ConstructorOverloading {
// Developing Two or more constructors same constructor name but different arguement type
// Constructor classified into two types.
// 1.Default Constructor  2. Constructor With arguemets.
	public String name;
	public int jerseyNo;
	public double average;
	
	public ConstructorOverloading(String name,int jerseyNo,double average)
	{
		this.name=name;
		this.jerseyNo=jerseyNo;
		this.average=average;
	}
	public ConstructorOverloading(int jerseyNo,String name,double average)
	{
		this.name=name;
		this.jerseyNo=jerseyNo;
		this.average=average;		
	}
	public void displayInfo() {
	
		System.out.println(name);
		System.out.println(jerseyNo);
		System.out.println(average);
		System.out.println("******************************");

	}
	
	public static void main(String[] args) {
		ConstructorOverloading c1=new ConstructorOverloading("M S Dhoni",7,99.9);
		ConstructorOverloading c2=new ConstructorOverloading(18,"Virat Kohli",68.5);
		c1.displayInfo();
		c2.displayInfo();
		}
}

