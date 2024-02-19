package Problems;

import javax.swing.ScrollPaneLayout;

public class Employee {
private String name;
private int id;
private double salary;
private double bonous;


public Employee(String name, int id, double salary, double bonous) {
	super();
	this.name = name;
	this.id = id;
	this.salary = salary;
	this.bonous = bonous;
}


public void average()
{
	System.out.println(salary+bonous/100);
}
public static void main(String[] args) {
	Employee[] e1= {new Employee("Duryodhana", 962, 16413, 20.0),new Employee("Affan", 855, 19999, 20.0)};
	for(int a=0;a<e1.length;a++)
	{
		e1[a].average();
	}
}
}
