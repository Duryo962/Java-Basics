package Oops_Programs;
class cricket{
	public void country() {
		System.out.println("India");
	}
	public void PlayerName() {
		System.out.println("sdfsdf");
	}
	public void jerseyNo() {
		System.out.println("dxc");
	}
}
class Dhoni extends cricket{

	@Override
	public void PlayerName() {
		// TODO Auto-generated method stub
		System.out.println("M S Dhoni");
	}

	@Override
	public void jerseyNo() {
		// TODO Auto-generated method stub
		System.out.println("7");
	}
	
}
class Gayle extends cricket{

	@Override
	public void country() {
		// TODO Auto-generated method stub
		System.out.println("West Indies");
	}

	@Override
	public void PlayerName() {
		// TODO Auto-generated method stub
		System.out.println("Chrish Gayle");
	}

	@Override
	public void jerseyNo() {
		// TODO Auto-generated method stub
		System.out.println("333");
	}
	
}
public class MethodOverriding {
public static void main(String[] args) {
	Dhoni d1=new Dhoni();
	d1.country();
	d1.PlayerName();
	d1.jerseyNo();
	System.out.println("****************");
	System.out.println();
	Gayle g1=new Gayle();
	g1.country();
	g1.PlayerName();
	g1.jerseyNo();
}

}
