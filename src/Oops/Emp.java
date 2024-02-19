package Oops;

public class Emp {

	private String name;
	private int id;
	private double salary;
	private double percentage;
	
	public Emp(String name, int id, double salary, double percentage) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.percentage = percentage;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void calculateBonus()
	{
		System.out.println("Total Salary With Bonus : "+salary+(salary*percentage/100));
	}
}
