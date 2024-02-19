package Oops;

public class MethodWithReturnType {

	public static String name(String name1)
	{
		return name1;
	}
	
	public int age(int age)
	{
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(name("Duryodhana"));
		MethodWithReturnType m=new MethodWithReturnType();
//		System.out.println(m.age(23));
		String name=name("Duryodhana");
	    int age=m.age(23);
	    System.out.println(name);
	    System.out.println(age);

	}

}

