package Problems;
//Create a Student class with attributes name, age, and grade. Implement methods to
//set and get these attributes. Write a displayInfo() method to display the student's information.
public class Student {

	public String name;
	public int age;
	public char grade;
	public Student(String name, int age, char grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public void displayInfo() {
		
		System.out.println("Student Name : "+name);
		System.out.println("Student Age  : "+age);
		System.out.println("Student Grade: "+grade);
	}

}

