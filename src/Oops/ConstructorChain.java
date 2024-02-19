package Oops;

class UnEmployee
{
	public String name;
	public char gender;
	public String eMail;
	public long MobileNumber;
	public UnEmployee(String name, char gender, String eMail, long mobileNumber) {
		super();
		this.name = name;
		this.gender = gender;
		this.eMail = eMail;
		this.MobileNumber = mobileNumber;
	}
	public void displayDetails() {
		System.out.println("Name         : "+name);
		System.out.println("Gender       : "+gender);
		System.out.println("Email        : "+eMail);
		System.out.println("Mobile number: "+MobileNumber);
		System.out.println("*************************************");
	}
	
}
class Employee extends UnEmployee{
	public int id;

	public Employee(String name, char gender, String eMail, long mobileNumber,int id) {
		super(name, gender, eMail, mobileNumber);
		this.id=id;
		
	}
	public void displayDetails() {
		System.out.println("Name         : "+name);
		System.out.println("Gender       : "+gender);
		System.out.println("Email        : "+eMail);
		System.out.println("Mobile number: "+MobileNumber);
		System.out.println("ID           : "+id);
		System.out.println("*************************************");
	}
	
}