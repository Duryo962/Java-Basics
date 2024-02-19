package Problems;

 class Student1 {
	private String name;
	private int age;
	private char grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void displayInfo() {
		System.out.println("Student Name : "+name);
		System.out.println("Student Age  : "+age);
		System.out.println("Student Grade: "+grade);
	}
	
	
	

}
